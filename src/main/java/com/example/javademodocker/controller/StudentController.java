package com.example.javademodocker.controller;

import com.example.javademodocker.model.Student;
import com.example.javademodocker.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public String hello(ModelMap map) {
        return "hello word. How are you ?";
    }

    @PostMapping("/add")
    public String insertStudent(@RequestParam String name,
                                @RequestParam Integer birth) {

        studentRepository.save(
                Student.builder()
                        .name(name)
                        .birth(birth)
                        .build());

        return "them moi thanh cong";
    }

    @GetMapping("/list")
    public List<Student> fetchStudent(){
        return studentRepository.findAll();
    }
}
