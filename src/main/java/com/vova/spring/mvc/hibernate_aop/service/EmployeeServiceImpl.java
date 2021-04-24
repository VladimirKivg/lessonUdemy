package com.vova.spring.mvc.hibernate_aop.service;

import com.vova.spring.mvc.hibernate_aop.dao.EmployeeDao;
import com.vova.spring.mvc.hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao  employeeDao;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }
}
