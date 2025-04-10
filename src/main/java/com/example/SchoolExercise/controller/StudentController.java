package com.example.SchoolExercise.controller;

import com.example.SchoolExercise.exceptions.AlreadyExistsException;
import com.example.SchoolExercise.model.StudentDTO;
import com.example.SchoolExercise.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.AlreadyBoundException;

@RestController
@RequestMapping("api/v1/university_exercise")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public ResponseEntity<String> createStudent (@RequestBody StudentDTO dto){
        try {
            studentService.createStudent(dto);

        } catch (AlreadyExistsException e) {
            Error error = new Error((e.getMessage()));
        }
        return ResponseEntity.ok("ok");
    }
}
