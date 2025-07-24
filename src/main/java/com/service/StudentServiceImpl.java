package com.service;

import com.Repositary.StudentRepositary;
import com.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepositary studentRepositary;

    public StudentServiceImpl(StudentRepositary studentRepositary) {
        this.studentRepositary = studentRepositary;
    }

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

    @Override
    public List<Student> updateStudent(int id, String name) {
        return studentRepositary.updateStudent(id, name);
    }

    @Override
    public String deleteStudent(int id) {
        return studentRepositary.deleteStudent(id);
    }

}


