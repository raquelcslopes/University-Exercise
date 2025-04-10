package com.example.SchoolExercise.entity;

public final class StudentBuilder {
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String birthday;
    private String email;

    private StudentBuilder() {
    }

    public static StudentBuilder aStudent() {
        return new StudentBuilder();
    }

    public StudentBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public StudentBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }

    public StudentBuilder birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public StudentBuilder email(String email) {
        this.email = email;
        return this;
    }

    public Student build() {
        Student student = new Student();
        student.setId(id);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setGender(gender);
        student.setBirthday(birthday);
        student.setEmail(email);
        return student;
    }
}
