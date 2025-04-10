package com.example.SchoolExercise.entity;
//relação fraca com subject
import jakarta.persistence.*;



import java.util.ArrayList;
import java.util.List;
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentId")
    private Long id;

    @Column(name = "First name")
    private String firstName;

    @Column(name = "Last name")
    private String lastName;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Birthday")
    private String birthday;

    @Column(name = "Email", unique = true)
    private String email;

   @ManyToMany (mappedBy = "students")
    List<Teacher> teachers;

   @ManyToMany
    @JoinTable(
            name = "student_subject",
            joinColumns = @JoinColumn (name = "student_id"),
            inverseJoinColumns = @JoinColumn (name = "subject_id")
    )
    List <Subject> subjects;

    public Student(String email, String birthday, String gender, String lastName, String firstName, Long id) {
        this.email = email;
        this.birthday = birthday;
        this.gender = gender;
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
