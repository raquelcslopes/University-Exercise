package com.example.SchoolExercise.controller;

import com.example.SchoolExercise.entity.Student;
import com.example.SchoolExercise.exceptions.AlreadyExistsException;
import com.example.SchoolExercise.model.StudentDTO;
import com.example.SchoolExercise.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.AlreadyBoundException;
import java.util.List;

@RestController
@RequestMapping("api/v1/university_exercise")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public ResponseEntity<String> createStudent (@RequestBody StudentDTO dto){
            studentService.createStudent(dto);
        return ResponseEntity.ok("Student created successfully!");
    }

    @GetMapping(path="students")
    public ResponseEntity<?> getAllStudents () {
        List<Student> students;
        students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    @DeleteMapping(path = "student/{id}")
    public ResponseEntity<?> deleteStudent (@RequestBody StudentDTO dto) {
        studentService.deleteStudent(dto);
        return ResponseEntity.ok("Student deleted");
    }

    @PostMapping(path = "student/{id}/changes")
    public ResponseEntity<?> updateFullAccountDetails (@RequestBody StudentDTO dto) {
        studentService.updateFullAccountDetails(dto);
        return ResponseEntity.ok("Account updated");
    }
}
