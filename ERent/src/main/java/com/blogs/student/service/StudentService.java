package com.blogs.student.service;

import com.blogs.student.entity.Student;

import java.util.List;

public interface StudentService {

    public Student addStudent(Student student);
    public List<Student> getAllStudents();

}
