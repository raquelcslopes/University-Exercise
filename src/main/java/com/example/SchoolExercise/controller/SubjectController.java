package com.example.SchoolExercise.controller;

import com.example.SchoolExercise.entity.Subject;
import com.example.SchoolExercise.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/subject")
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @PostMapping
    public ResponseEntity<?> createSubject (@RequestBody Subject subject) {
        return ResponseEntity.ok("Oki doki");
    }
}
