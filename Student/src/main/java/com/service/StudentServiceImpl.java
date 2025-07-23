package com.service;

import com.Repositary.StudentRepositary;
import com.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepositary studentRepositary;

    @Override
    public List<Student> getStudentData() {
        return studentRepositary.getStudentData();
    }

    /**
     * @param student
     */
    @Override
    public String addStudent(Student student) {
      return studentRepositary.addStudent(student);
    }

    /**
     * @param student
     * @return
     */
    @Override
    public String updateStudent(Student student) {
        return studentRepositary.updateStudent(student);
    }
}
