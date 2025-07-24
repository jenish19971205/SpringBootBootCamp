package com.doctutorials.studentapp.controller;

import com.model.Student;
import com.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService=studentService;
    }

    @GetMapping("/getStudent")
    public List<Student> getStudent() {
        return studentService.getStudentData();
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);

    }
    @PutMapping("/updateStudent")
    public List<Student> updateStudent(){
        int id = 2;
        String name = "Rachel";
        return studentService.updateStudent(id,name);
    }
    @DeleteMapping("/deleteStudent")
    public String deleteStudent(){
        int id = 1;
        return studentService.deleteStudent(id);
    }


}
