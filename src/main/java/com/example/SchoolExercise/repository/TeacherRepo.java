package com.example.SchoolExercise.repository;

import com.example.SchoolExercise.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long> {
    Optional<Teacher> findByEmail (String email);
}
