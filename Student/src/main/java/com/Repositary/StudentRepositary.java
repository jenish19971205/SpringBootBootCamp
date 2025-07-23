package com.Repositary;

import com.model.Student;

import java.util.List;

public interface StudentRepositary {

    List<Student> getStudentData();

   public String addStudent(Student student);

    String updateStudent(Student student);
}
