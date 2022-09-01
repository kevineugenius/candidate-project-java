package com.zoomcare.candidatechallenge.controllers;

import com.zoomcare.candidatechallenge.Entities.Employee;
import com.zoomcare.candidatechallenge.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    Employee GetEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }
}