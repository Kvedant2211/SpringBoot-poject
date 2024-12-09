package com.example.Emp.management.Repository;

import com.example.Emp.management.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EmpRepo extends JpaRepository<Employee, Long> {

}

