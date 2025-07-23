package com.doctutorials.studentapp.controller;

import com.model.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudent")
    public List<Student> getStudent() {
        return studentService.getStudentData();
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);

    }
    @PutMapping("/updateStudent")
    public String updateStudent(@RequestParam Student student){
        return studentService.updateStudent(student);
    }
}
