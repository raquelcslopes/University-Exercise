package com.example.SchoolExercise.repository;

import com.example.SchoolExercise.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Long> {
}
