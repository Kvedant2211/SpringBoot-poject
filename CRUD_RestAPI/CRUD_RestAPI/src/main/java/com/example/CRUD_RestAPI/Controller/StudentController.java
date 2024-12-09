package com.example.CRUD_RestAPI.Controller;

import com.example.CRUD_RestAPI.Model.Student;
import com.example.CRUD_RestAPI.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

        @Autowired
        StudentService service;


        @GetMapping("/students")
        public List<Student> getAllStudents(){
            return service.getAllStudents();
        }

        @GetMapping("/students/{id}")
        public Student getStudentbyId(@PathVariable int id){
            return service.getStudentbyId(id);
        }

        @PostMapping("students/add")
        @ResponseStatus(code= HttpStatus.CREATED)
        public void createStudent(@RequestBody Student student){
            service.createStudent(student);
        }

        @PutMapping("students/update/{id}")
        public void updateStudentbyId(@PathVariable int id, @RequestBody Student updatedStudent){
        service.updateStudentbyId(id,updatedStudent);
        }

        @DeleteMapping("students/delete/{id}")
        public void deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
        }


}
