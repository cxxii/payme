package com.example.payapp.controller;


import com.example.payapp.entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class EmployeeController {

    @GetMapping("/")
    public List<Employee> getEmployee() {

    }


}
