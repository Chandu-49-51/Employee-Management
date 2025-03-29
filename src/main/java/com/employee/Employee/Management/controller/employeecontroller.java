package com.employee.Employee.Management.controller;

import com.employee.Employee.Management.entity.Employee;
import com.employee.Employee.Management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class employeecontroller {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{name}")
    public Employee getEmployee(@PathVariable("name") String name){
        return employeeService.getEmployee(name);

    }
}
