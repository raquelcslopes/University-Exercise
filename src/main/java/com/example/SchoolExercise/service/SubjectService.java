package com.example.SchoolExercise.service;

import com.example.SchoolExercise.entity.Subject;
import com.example.SchoolExercise.repository.SubjectRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubjectService {

    private final SubjectRepo subjectRepo;

    public SubjectService(SubjectRepo subjectRepo) {
        this.subjectRepo = subjectRepo;
    }

    public Subject createSubject (Subject subject) {
        Optional<Subject> subjectOptional = subjectRepo.
    }
}
