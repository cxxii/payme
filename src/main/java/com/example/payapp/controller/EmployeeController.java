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

    @GetMapping("employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @DeleteMapping("employee/{id}")
    public String deleteEmployeeById(@PathVariable("id") Long employeeId) {
        employeeService.deleteEmployeeById(employeeId);
        return "Employee deleted";
    }

    @PutMapping("employee/{id}")
    public Employee updateEmployeeById(
            @PathVariable("id") Long employeeId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String jobTitle,
            @RequestParam(required = false) String salary) {
                employeeService.updateEmployeeById(employeeId, name, jobTitle, salary);
                return ;
    }
}
