package com.example.SchoolExercise.controller;

import com.example.SchoolExercise.entity.Student;
import com.example.SchoolExercise.entity.Teacher;
import com.example.SchoolExercise.model.StudentDTO;
import com.example.SchoolExercise.model.TeacherDTO;
import com.example.SchoolExercise.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/university_exercise/teacher")

public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @PostMapping
    public ResponseEntity<String> createTeacher (@RequestBody TeacherDTO dto){
        teacherService.createTeacher(dto);
        return ResponseEntity.ok("Teacher created successfully!");
    }

    @GetMapping(path="all")
    public ResponseEntity<?> getAllStudents () {
        List<Teacher> teachers;
        teachers = teacherService.getAllTeachers();
        return ResponseEntity.ok(teachers);
    }

    @DeleteMapping(path = "teacher/{id}")
    public ResponseEntity<?> deleteTeacher (@RequestBody TeacherDTO dto) {
        teacherService.deleteTeacher(dto);
        return ResponseEntity.ok("Teacher deleted");
    }
}
