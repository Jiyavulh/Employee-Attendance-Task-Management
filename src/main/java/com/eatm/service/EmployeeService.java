package com.eatm.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eatm.dao.AddressDao;
import com.eatm.dao.AttendanceDao;
import com.eatm.dao.EmployeeDao;
import com.eatm.dao.TaskDao;
import com.eatm.dto.AddressDto;
import com.eatm.dto.AttendanceDto;
import com.eatm.dto.EmployeeDto;
import com.eatm.dto.TaskDto;
import com.eatm.entity.Address;
import com.eatm.entity.Attendance;
import com.eatm.entity.Employee;
import com.eatm.entity.Status;
import com.eatm.entity.Task;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private AddressDao addressDao;

    @Autowired
    private AttendanceDao attendanceDao;

    @Autowired
    private TaskDao taskDao;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AttendanceDto attendanceDto;
    
    @Autowired
    private HttpServletRequest request;
    @Override
    public String registerEmployee(EmployeeDto employeeDto, AddressDto addressDto) {

        Employee employee = modelMapper.map(employeeDto, Employee.class);
        employee.setRole("manager");

        Address address = modelMapper.map(addressDto, Address.class);
        employee.setAddress(address);

        addressDao.saveAddress(address);
        employeeDao.saveEmployee(employee);

        return "success.jsp";
    }

   
    @Override
    public String loginEmployee(String email, String password) {

        Employee dbEmployee =
                employeeDao.findEmployeeByEmailAndPassword(email, password);

        if (dbEmployee == null) {
            return "failure.jsp";
        }

        // create attendance
        Attendance attendance = new Attendance();
        attendance.setLoginTime(java.time.LocalDateTime.now());

        attendanceDao.saveAttendance(attendance);

        // attach attendance to employee
        List<Attendance> list = dbEmployee.getAttendances();
        if (list == null) {
            list = new java.util.ArrayList<>();
        }
        list.add(attendance);
        dbEmployee.setAttendances(list);

        employeeDao.updateEmployee(dbEmployee);

        // store employee in session
        request.getSession().setAttribute("employee", dbEmployee);

        if ("manager".equals(dbEmployee.getRole())) {
            return "manager.jsp";
        } else if ("developer".equals(dbEmployee.getRole())) {
            return "developer.jsp";
        }

        return "success.jsp";
    }
    @Override
    public String addDeveloper(String employeeName,
                               String email,
                               String password,
                               String phoneNumber,
                               String salary,
                               int houseNumber,
                               String area,
                               String city,
                               String state,
                               String country,
                               long pincode) {

        Employee employee = new Employee();
        employee.setEmployeeName(employeeName);
        employee.setEmail(email);
        employee.setPassword(password);
        employee.setPhoneNumber(Long.parseLong(phoneNumber));
        employee.setSalary(Double.parseDouble(salary));
        employee.setRole("developer");

        Address address = new Address();
        address.setHouseNumber(houseNumber);
        address.setArea(area);
        address.setCity(city);
        address.setState(state);
        address.setCountry(country);
        address.setPincode(pincode);

       
        addressDao.saveAddress(address);

        employee.setAddress(address);

        employeeDao.saveEmployee(employee);

        return "developerSuccess.jsp";
    }


    @Override
    public String createTask(TaskDto taskDto) {

        Task task = modelMapper.map(taskDto, Task.class);
        task.setStatus(Status.CREATED);

        taskDao.saveTask(task);

        return "success.jsp";
    }
    @Override
    public String assignTask(int developerId, int taskId) {

        Employee emp = employeeDao.findEmployeeById(developerId);
        Task task = taskDao.findTaskById(taskId);

        if (emp == null || task == null) {
            return "failure.jsp";
        }

        // set status
        task.setStatus(Status.ASSIGNED);
        taskDao.updateTask(task);

        // attach task to employee
        List<Task> tasks = emp.getTask();
        tasks.add(task);
        emp.setTask(tasks);

        employeeDao.updateEmployee(emp);

        return "result.jsp";
    }
    
    @Override
    public String viewDeveloperWithTask() {

        List<Employee> list = employeeDao.findAllDevelopers();

        request.setAttribute("allData", list);

        return "displayDeveloper.jsp";
    }
    
    @Override
    public String deleteDeveloper(int employeeId) {

        Employee emp = employeeDao.findEmployeeById(employeeId);

        if (emp != null) {
            employeeDao.deleteEmployee(emp);
            return "deletesuccss.jsp";
        }

        return "failure.jsp";
    }
    @Override
    public String logout(int attendanceId) {

        // take attendance id
        Attendance attendance =
                attendanceDao.findAttendanceById(attendanceId);

        // set logout time
        attendance.setLogoutTime(
                java.time.LocalDateTime.now()
        );

        // update attendance
        attendanceDao.updateAttendance(attendance);

        return "logoutsuccess.jsp";
    }
    @Override
    public String updateDeveloper(int employeeId,
                                  String value,
                                  HttpServletRequest request) {

        Employee emp = employeeDao.findEmployeeById(employeeId);

        if (emp == null) {
            return "failure.jsp";
        }

        String option = (String) request.getSession()
                                        .getAttribute("option");

        if ("Name".equals(option)) {
            emp.setEmployeeName(value);
        } 
        else if ("Email".equals(option)) {
            emp.setEmail(value);
        } 
        else if ("PhoneNumber".equals(option)) {
            emp.setPhoneNumber(Long.parseLong(value));
        }

        employeeDao.updateEmployee(emp);

        return "updateSuccess.jsp";
    }	
    @Override
    public String viewMyTasks() {

        Employee emp =
            (Employee) request.getSession().getAttribute("employee");

        if (emp == null) {
            return "failure.jsp";
        }

        List<Task> tasks = emp.getTask();

        if (tasks == null || tasks.isEmpty()) {
            request.setAttribute("taskList", null);
        } else {
            request.setAttribute("taskList", tasks);
        }

        return "viewMyTasks.jsp";
    }
    @Override
    public String changeTaskStatus(int taskId, String status) {

        Task task = taskDao.findTaskById(taskId);

        if (task == null) {
            return "failure.jsp";
        }

        // convert string to enum
        Status newStatus = Status.valueOf(status);

        task.setStatus(newStatus);
        taskDao.updateTask(task);

        return "updateSuccess.jsp";
    }
    }
	