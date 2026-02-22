package com.eatm.service;

import com.eatm.dto.AddressDto;
import com.eatm.dto.EmployeeDto;
import com.eatm.dto.TaskDto;

import jakarta.servlet.http.HttpServletRequest;

public interface IEmployeeService {

    public String registerEmployee(EmployeeDto employeeDto, AddressDto addressDto);

    public String loginEmployee(String email, String password);

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
                               long pincode);

    public String createTask(TaskDto taskDto);

 
    public String assignTask(int developerId, int taskId);
    public String viewDeveloperWithTask();
    
    public String deleteDeveloper(int employeeId);
    
    public String logout(int attendanceId);
    public String updateDeveloper(int employeeId,
            String value,
            HttpServletRequest request);
    
    public String viewMyTasks();
    public String changeTaskStatus(int taskId, String status);

	
}