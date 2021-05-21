package com.vova.spring.mvc.hibernate_aop.dao;

import com.vova.spring.mvc.hibernate_aop.entity.Employee;

import java.util.List;


public interface            EmployeeDao {
    List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee  getEmployees(int id);

    public void deleteEmployee(int id);
}
