package com.example.payapp.controller;


import com.example.payapp.entity.Employee;
import com.example.payapp.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    private final Logger LOGGER =
            LoggerFactory.getLogger(EmployeeController.class);


    //POSTS
    @PostMapping("/employee")
        public Employee saveEmployee(@RequestBody Employee employee) {
            return employeeService.saveEmployee(employee);
    }


    //GETS

    @GetMapping("/employee")
    public List<Employee> getEmployee() {
        return employeeService.getEmployee();
    }

    @GetMapping("employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @GetMapping("employee/jobTitle/{jobTitle}")
    public List<Employee> getEmployeeByJobTitle(@PathVariable("jobTitle") String jobTitle) {
        return employeeService.getEmployeeByjobTitle(jobTitle);
    }

    @GetMapping("employee/name/{name}")
    public List<Employee> getEmployeeByName(@PathVariable("name") String name) {
        return employeeService.getEmployeeByName(name);
    }



    // PUTS

    @PutMapping("employee/{id}")
    public void updateEmployeeById(
            @PathVariable("id") Long employeeId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String jobTitle,
            @RequestParam(required = false) int salary) {
                employeeService.updateEmployeeById(employeeId, name, jobTitle, salary);
    }


    // DELETES

    @DeleteMapping("employee/{id}")
    public String deleteEmployeeById(@PathVariable("id") Long employeeId) {
        employeeService.deleteEmployeeById(employeeId);
        return "Employee deleted";
    }




}
