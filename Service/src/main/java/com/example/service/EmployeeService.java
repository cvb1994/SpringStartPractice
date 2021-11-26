package com.example.service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository empRepo;

    public List<Employee> getList(){
        return empRepo.findAll();
    }

    public Employee getEmployee(int id){
        return empRepo.findById(id).get();
    }

    public String save(Employee emp){
        if(emp == null) return "failed";
        Employee result = empRepo.save(emp);
        if(result != null) return "success";
        return "failed";
    }
}
