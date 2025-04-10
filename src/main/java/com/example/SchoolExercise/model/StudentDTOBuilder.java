package com.example.SchoolExercise.model;

import jakarta.validation.constraints.NotBlank;

public final class StudentDTOBuilder {
    private Long id;
    private @NotBlank(message = "Must have first name") String firstName;
    private @NotBlank(message = "Must have last name") String lastName;
    private @NotBlank String email;

    private StudentDTOBuilder() {
    }

    public static StudentDTOBuilder aStudentDTO() {
        return new StudentDTOBuilder();
    }

    public StudentDTOBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public StudentDTOBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentDTOBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentDTOBuilder email(String email) {
        this.email = email;
        return this;
    }

    public StudentDTO build() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(id);
        studentDTO.setFirstName(firstName);
        studentDTO.setLastName(lastName);
        studentDTO.setEmail(email);
        return studentDTO;
    }
}
