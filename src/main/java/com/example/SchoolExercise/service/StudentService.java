package com.example.SchoolExercise.service;

import com.example.SchoolExercise.entity.Student;
import com.example.SchoolExercise.entity.StudentBuilder;
import com.example.SchoolExercise.exceptions.AlreadyExistsException;
import com.example.SchoolExercise.model.StudentDTO;
import com.example.SchoolExercise.model.StudentDTOBuilder;
import com.example.SchoolExercise.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.rmi.AlreadyBoundException;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }


    public void createStudent(StudentDTO dto) throws AlreadyExistsException {
        Optional<Student> studentOptional = studentRepo.findByEmail(dto.getEmail());

        if(studentOptional.isPresent()) {
            throw new AlreadyExistsException("Already there");
        }

        Student student = StudentBuilder.aStudent()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .build();

       this.studentRepo.save(student);
    }
}
