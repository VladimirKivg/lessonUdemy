package com.vova.spring.mvc.hibernate_aop.service;

import com.vova.spring.mvc.hibernate_aop.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }
}
