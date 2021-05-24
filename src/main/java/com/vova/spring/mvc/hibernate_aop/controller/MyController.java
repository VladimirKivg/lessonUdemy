package com.vova.spring.mvc.hibernate_aop.controller;


import com.vova.spring.mvc.hibernate_aop.entity.Employee;
import com.vova.spring.mvc.hibernate_aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class        MyController {

//    @Autowired
//    private EmployeeDao employeeDao;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("       ")
    public String shoeAllEmployees(Model model) {
//        List<Employee> allEmployees = employeeDao.getAllEmployees();

        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "all-employees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info";
    }

    @RequestMapping("saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {

        //       Employee employee1 = new Employee("vova",  "vova", "it ingenering", 1700);

        employeeService.saveEmployee(employee);

        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") int id, Model model) {
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);

        return "employee-info";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id) {

        employeeService.deleteEmployee(id);

        return "redirect:/";
    }

}
