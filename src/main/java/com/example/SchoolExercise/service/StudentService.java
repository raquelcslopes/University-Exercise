package com.example.SchoolExercise.service;

import com.example.SchoolExercise.entity.Student;
import com.example.SchoolExercise.entity.StudentBuilder;
import com.example.SchoolExercise.exceptions.AlreadyExistsException;
import com.example.SchoolExercise.exceptions.NoStudentException;
import com.example.SchoolExercise.exceptions.NotValidException;
import com.example.SchoolExercise.model.StudentDTO;
import com.example.SchoolExercise.model.StudentDTOBuilder;
import com.example.SchoolExercise.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.rmi.AlreadyBoundException;
import java.util.List;
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
            throw new AlreadyExistsException("This email is already in use");
        }

        Student student = StudentBuilder.aStudent()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .build();


       this.studentRepo.save(student);
    }


    public List<Student> getAllStudents () {
        return studentRepo.findAll();
    }

    public void deleteStudent (StudentDTO dto) {
        Optional<Student> studentOptional = studentRepo.findById(dto.id);

        if (studentOptional.isEmpty()) {
            throw new NoStudentException("There's no student with those credentials");
        }

        studentRepo.delete(studentOptional.get());
    }

    public StudentDTO updateFullAccountDetails (StudentDTO dto) {
        Optional<Student> studentOptional = studentRepo.findById(dto.getId());

        if(studentOptional.isEmpty()) {
            throw new NoStudentException("There is no student with those credentials");
        }

        Student student = studentOptional.get();

        if(dto.getFirstName().isEmpty()){
            throw new NotValidException("Need to fill all the fields");
        }

        if(dto.getLastName().isEmpty()){
            throw new NotValidException("Need to fill all the fields");
        }

        if(dto.getEmail().isEmpty()){
            throw new NotValidException("Need to fill all the fields");
        }

        Student studentReceived = StudentBuilder.aStudent()
                .id(dto.getId())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .build();

        studentReceived.setId(student.getId());

        studentRepo.save(studentReceived);

        StudentDTO studentDTO = StudentDTOBuilder.aStudentDTO()
                .id(studentReceived.getId())
                .firstName(studentReceived.getFirstName())
                .lastName(studentReceived.getLastName())
                .email(studentReceived.getEmail())
                .build();
        return studentDTO;
    }
}
