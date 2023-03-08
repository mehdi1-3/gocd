package com.mehdi.springboot.SpringBootRestWithH2.service;

import com.mehdi.springboot.SpringBootRestWithH2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeService extends JpaRepository<Employee, Integer>{
}
