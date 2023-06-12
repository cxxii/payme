package com.example.payapp.service;


import com.example.payapp.entity.Employee;
import com.example.payapp.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public void deleteEmployeeById(Long employeeId) {
        employeeRepository.deleteById(employeeId);

    }

    @Override
    @Transactional
    public void updateEmployeeById(Long employeeId, String name, String jobTitle, int salary) {
        Employee employee = employeeRepository.findById(employeeId).get();

        if (name != null && name.length() > 0 && !Objects.equals(employee.getName(), name)) {
            employee.setName(name);
        }

        if (jobTitle != null && jobTitle.length() > 0 && !Objects.equals(employee.getJobTitle(), jobTitle)) {
            employsalaryetName(jobTitle);
        }

        if (salary > 0 && employee.getSalary() != salary) {
            employee.setSalary(salary);
        }
    }


}
