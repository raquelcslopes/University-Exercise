package com.example.SchoolExercise.service;

import com.example.SchoolExercise.entity.Student;
import com.example.SchoolExercise.entity.Teacher;
import com.example.SchoolExercise.entity.TeacherBuilder;
import com.example.SchoolExercise.exceptions.AlreadyExistsException;
import com.example.SchoolExercise.exceptions.NoTeacherException;
import com.example.SchoolExercise.model.TeacherDTO;
import com.example.SchoolExercise.model.TeacherDTOBuilder;
import com.example.SchoolExercise.repository.TeacherRepo;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    private final TeacherRepo teacherRepo;

    public TeacherService(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    public void createTeacher (TeacherDTO dto) {
        Optional<Teacher> optionalTeacher = teacherRepo.findByEmail(dto.getEmail());
        if (optionalTeacher.isPresent()) {
            throw new AlreadyExistsException("This email is already in use");
        }

        Teacher teacher = TeacherBuilder.aTeacher()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .build();

        this.teacherRepo.save(teacher);
    }

    public List<Teacher> getAllTeachers () {
        return teacherRepo.findAll();
    }

    public void deleteTeacher(TeacherDTO dto) {
        Optional<Teacher> teacherOptional = teacherRepo.findById(dto.getId());

        if(teacherOptional.isEmpty()) {
            throw new NoTeacherException("There's no teacher with those credentials");
        }
        teacherRepo.delete(teacherOptional.get());
    }
}
