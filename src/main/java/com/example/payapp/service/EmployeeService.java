package com.example.payapp.service;

import com.example.payapp.entity.Employee;
import com.example.payapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {


    Employee saveEmployee(Employee employee);

    List<Employee> getEmployee();

    Employee getEmployeeById(Long employeeId);

    void deleteEmployeeById(Long employeeId);

    void updateEmployeeById(Long employeeId, String name, String jobTitle, String salary);
}
