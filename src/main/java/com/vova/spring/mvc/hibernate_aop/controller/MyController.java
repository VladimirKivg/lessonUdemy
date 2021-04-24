package com.vova.spring.mvc.hibernate_aop.controller;

import com.vova.spring.mvc.hibernate_aop.dao.EmployeeDao;
import com.vova.spring.mvc.hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class MyController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/")
    public String shoeAllEmployees(Model model){
        List<Employee> allEmployees = employeeDao.getAllEmployees();

model.addAttribute("allEmps",allEmployees);
        return "all-employees";
    }
}
