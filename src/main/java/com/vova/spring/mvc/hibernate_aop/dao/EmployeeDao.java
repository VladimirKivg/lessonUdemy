package com.vova.spring.mvc.hibernate_aop.dao;

import com.vova.spring.mvc.hibernate_aop.entity.Employee;

import java.util.List;


public interface EmployeeDao {
List<Employee> getAllEmployees();
}
