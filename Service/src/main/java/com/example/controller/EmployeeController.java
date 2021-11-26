package com.example.controller;

import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService empSer;


    @GetMapping(value = "/index")
    public ModelAndView showList(){
        ModelAndView model = new ModelAndView("index");
        List<Employee> list = empSer.getList();
        model.addObject("list",list);
        return model;
    }

    @GetMapping(value = "/employee/add")
    public ModelAndView showForm(@RequestParam(value = "id", required = false) Integer id ){
        ModelAndView model = new ModelAndView("employeeForm");
        Employee employee = new Employee();
        if(id != null){
            employee = empSer.getEmployee(id);
        }
        model.addObject("employee", employee);

        return model;
    }

    @PostMapping(value = "/employee/save")
    public String saveEmployee(@ModelAttribute("product") Employee employee){
        if(employee == null){
            return "redirect:/index";
        }
        String result = empSer.save(employee);
        return "redirect:/index";
    }
}
