package com.example.Emp.management.Service;

import com.example.Emp.management.Model.Department;
import com.example.Emp.management.Model.Employee;
import com.example.Emp.management.Model.EmployeeDTO;
import com.example.Emp.management.Model.Role;
import com.example.Emp.management.Repository.DeptRepo;
import com.example.Emp.management.Repository.EmpRepo;
import com.example.Emp.management.Repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmpRepo employeeRepository;

    @Autowired
    private DeptRepo departmentRepository;

    @Autowired
    private RoleRepo roleRepository;

    // Task 1: Create Employee
    public void createEmployee(EmployeeDTO employeeDTO) {
        // Fetch department and role using their IDs
        Department department = departmentRepository.findById(employeeDTO.getDepartmentId())
                .orElseThrow(() -> new RuntimeException("Invalid department ID: " + employeeDTO.getDepartmentId()));
        Role role = roleRepository.findById(employeeDTO.getRoleId())
                .orElseThrow(() -> new RuntimeException("Invalid role ID: " + employeeDTO.getRoleId()));

//        if (department != null && role != null) {
//            Employee employee = new Employee();
//            employee.setName(employeeDTO.getName());
//            employee.setEmail(employeeDTO.getEmail());
//            employee.setDepartment(department);
//            employee.setRole(role);
//            employeeRepository.save(employee);
//        }
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setDepartment(department);
        employee.setRole(role);

        // Save to the database
        employeeRepository.save(employee);
    }

    // Task 2: Get Employee Details
    public EmployeeDTO getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).orElse(null);

        if (employee != null) {
            // Map Employee to com.example.Emp.management.Model.EmployeeDTO
            return new EmployeeDTO(employee.getName(), employee.getEmail(),
                    employee.getDepartment().getName(), employee.getRole().getName());
        }
        return null;
    }
}


