package com.example.SchoolExercise.model;

import jakarta.validation.constraints.NotBlank;

public final class TeacherDTOBuilder {
    private Long id;
    private @NotBlank(message = "Must have first name") String firstName;
    private @NotBlank(message = "Must have last name") String lastName;
    private @NotBlank String email;

    private TeacherDTOBuilder() {
    }

    public static TeacherDTOBuilder aTeacherDTO() {
        return new TeacherDTOBuilder();
    }

    public TeacherDTOBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public TeacherDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public TeacherDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public TeacherDTOBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public TeacherDTO build() {
        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setFirstName(firstName);
        teacherDTO.setLastName(lastName);
        teacherDTO.setEmail(email);
        return teacherDTO;
    }
}
