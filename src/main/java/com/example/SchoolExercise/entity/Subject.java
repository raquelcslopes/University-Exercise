package com.example.SchoolExercise.entity;
//relação forte
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table

public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentId")
    private Long id;

    @Column(name = "Name")
    private String name;

    @ManyToMany(mappedBy = "subjects")
    List<Teacher> teachers;

    @ManyToMany(mappedBy = "subjects")
    List<Student> students;

    public Subject(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Subject() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
