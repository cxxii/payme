package com.example.payapp.controller;


import com.example.payapp.entity.Employee;
import com.example.payapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/employee")
        public Employee saveEmployee(@RequestBody Employee employee) {
            return employeeService.saveEmployee(employee);
    }


    @GetMapping("/employee")
    public List<Employee> getEmployee() {
        return employeeService.getEmployee();
    }

    public String hello() {
        return "TEST";
    }


}
