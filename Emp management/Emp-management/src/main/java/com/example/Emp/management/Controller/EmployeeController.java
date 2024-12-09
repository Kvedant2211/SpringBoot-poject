package com.example.Emp.management.Controller;

import com.example.Emp.management.Model.EmployeeDTO;
import com.example.Emp.management.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Task 1: Create Employee
    @PostMapping
    public String createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        employeeService.createEmployee(employeeDTO);
        return "Employee Added";
    }


    // Task 2: Get Employee Details
    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeDetails(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }
}
