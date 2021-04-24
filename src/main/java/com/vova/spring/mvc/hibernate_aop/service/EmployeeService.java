package com.vova.spring.mvc.hibernate_aop.service;

import com.vova.spring.mvc.hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
}
