package com.example.CRUD_RestAPI.Repository;

import com.example.CRUD_RestAPI.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
