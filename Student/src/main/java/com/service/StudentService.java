package com.service;

import com.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudentData();

    public String addStudent(Student student);

    String updateStudent(Student student);
}
