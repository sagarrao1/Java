package com.telusko.SpringJDBC.service;

import com.telusko.SpringJDBC.model.Student;
import com.telusko.SpringJDBC.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private StudentRepository reository;

    public StudentRepository getReository() {
        return reository;
    }

    @Autowired
    public void setReository(StudentRepository reository) {
        this.reository = reository;
    }

    public void addStudent(Student s) {
        System.out.println("Adding Student: " );
        reository.save(s);
    }

    public List<Student> getAllStudents() {
        return reository.findAll();
    }

    public void removeStudent(Student s) {
        reository.remove(s);
    }
}
