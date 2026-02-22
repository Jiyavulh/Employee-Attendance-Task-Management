package com.eatm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eatm.dto.AddressDto;
import com.eatm.dto.EmployeeDto;
import com.eatm.dto.TaskDto;
import com.eatm.service.IEmployeeService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;

    // ================= REGISTER MANAGER =================
    @RequestMapping("/register")
    public String registerEmployee(
            @ModelAttribute EmployeeDto employeeDto,
            @ModelAttribute AddressDto addressDto) {

        return employeeService.registerEmployee(employeeDto, addressDto);
    }

    // ================= LOGIN =================
    @RequestMapping("/login")
    public String loginEmployee(
            @RequestParam("email") String email,
            @RequestParam("password") String password) {

        return employeeService.loginEmployee(email, password);
    }

    // ================= ADD DEVELOPER =================
    @RequestMapping("/addDeveloper")
    public String addDeveloper(
            @RequestParam("employeeName") String employeeName,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("phoneNumber") String phoneNumber,
            @RequestParam("salary") String salary,
            @RequestParam("houseNumber") int houseNumber,
            @RequestParam("area") String area,
            @RequestParam("city") String city,
            @RequestParam("state") String state,
            @RequestParam("country") String country,
            @RequestParam("pincode") long pincode) {

        return employeeService.addDeveloper(
                employeeName, email, password, phoneNumber, salary,
                houseNumber, area, city, state, country, pincode);
    }

    // ================= CREATE TASK =================
    @RequestMapping("/createTask")
    public String createTask(@ModelAttribute TaskDto taskDto) {
        return employeeService.createTask(taskDto);
    }

    // ================= ASSIGN TASK =================
    @RequestMapping("/assignTask")
    public String assignTask(
            @RequestParam("employeeId") int developerId,
            @RequestParam("taskId") int taskId) {

        return employeeService.assignTask(developerId, taskId);
    }

    // ================= VIEW ALL DEVELOPERS WITH TASK =================
    @RequestMapping("/viewDeveloperWithTask")
    public String viewDeveloperWithTask() {
        return employeeService.viewDeveloperWithTask();
    }

    // ================= DELETE DEVELOPER =================
    @RequestMapping("/deleteDeveloper")
    public String deleteDeveloper(
            @RequestParam("employeeId") int employeeId) {

        return employeeService.deleteDeveloper(employeeId);
    }

    // ================= LOGOUT =================
    @RequestMapping("/logout")
    public String logout(@RequestParam("attendanceId") int attendanceId) {

        return employeeService.logout(attendanceId);
    }

    // ================= UPDATE DEVELOPER (NEW) =================
    @RequestMapping("/updateDeveloper")
    public String updateDeveloper(
            @RequestParam("employeeId") int employeeId,
            @RequestParam("value") String value,
            HttpServletRequest request) {

        return employeeService.updateDeveloper(employeeId, value, request);
    }
    
    @RequestMapping("/viewMyTasks")
    public String viewMyTasks() {
        return employeeService.viewMyTasks();
    }
    @RequestMapping("/changeTaskStatus")
    public String changeTaskStatus(
            @RequestParam("taskId") int taskId,
            @RequestParam("status") String status) {

        return employeeService.changeTaskStatus(taskId, status);
    }
}