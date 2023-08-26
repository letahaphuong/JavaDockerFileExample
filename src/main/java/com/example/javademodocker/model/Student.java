package com.example.javademodocker.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@Table(name = "students")
/**
 CREATE TABLE students(
 id INT PRIMARY KEY AUTO_INCREMENT,
 name VARCHAR(100),
 birth INT)
 */
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer birth;

    public Student() {
    }

    public Student(Integer id, String name, Integer birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
