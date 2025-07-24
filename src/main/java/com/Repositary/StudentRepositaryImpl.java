package com.Repositary;

import com.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositaryImpl implements StudentRepositary{


   static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1,"Ram","Chennai"));
        students.add(new Student(2,"Rajesh","Bangalore"));
    }
    @Override
    public List<Student> getStudentData() {
        return students;
    }


    @Override
    public String addStudent(Student student) {
        students.add(student);
        return "Students Data Added Sucessfully";
    }

    @Override
    public List<Student> updateStudent(int id, String name) {
        for (Student s : students){
            if (s.getId() == id){
                s.setName(name);
            }
        }
        return students;
    }

    @Override
    public String deleteStudent(int id) {
        students.remove(id);
        return "deleted the student data sucessfully";
    }


}
