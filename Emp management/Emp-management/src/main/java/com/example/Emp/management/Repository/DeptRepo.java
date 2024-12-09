package com.example.Emp.management.Repository;

import com.example.Emp.management.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepo extends JpaRepository<Department, Long> {
}
