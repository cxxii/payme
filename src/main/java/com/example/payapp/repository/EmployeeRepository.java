package com.example.payapp.repository;

import com.example.payapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //@Query("SELECT * FROM ")
    List<Employee> findByjobTitle(String jobTitle);

}
