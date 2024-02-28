package com.blogs.student.service;

import com.blogs.student.entity.Student;
import com.blogs.student.repo.StudentRepo;
import com.blogs.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo repo;
    @Override
    public Student addStudent(Student student) {
        return repo.save(student);
    }



}
