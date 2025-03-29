package com.employee.Employee.Management.service;

import com.employee.Employee.Management.entity.Employee;
import com.employee.Employee.Management.entity.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee getEmployee(String name){
       return employeeRepo.findByName(name);
    }
}
