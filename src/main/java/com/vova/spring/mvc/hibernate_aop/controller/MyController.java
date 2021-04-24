package com.vova.spring.mvc.hibernate_aop.controller;

import com.vova.spring.mvc.hibernate_aop.dao.EmployeeDao;
import com.vova.spring.mvc.hibernate_aop.entity.Employee;
import com.vova.spring.mvc.hibernate_aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class MyController {

//    @Autowired
//    private EmployeeDao employeeDao;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String shoeAllEmployees(Model model){
//        List<Employee> allEmployees = employeeDao.getAllEmployees();

        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps",allEmployees);
        return "all-employees";
    }
}
