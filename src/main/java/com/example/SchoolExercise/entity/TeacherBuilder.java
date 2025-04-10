package com.example.SchoolExercise.entity;

public final class TeacherBuilder {
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String birthday;
    private String email;

    private TeacherBuilder() {
    }

    public static TeacherBuilder aTeacher() {
        return new TeacherBuilder();
    }

    public TeacherBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public TeacherBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public TeacherBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public TeacherBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }

    public TeacherBuilder birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public TeacherBuilder email(String email) {
        this.email = email;
        return this;
    }

    public Teacher build() {
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setGender(gender);
        teacher.setBirthday(birthday);
        teacher.setEmail(email);
        return teacher;
    }
}
