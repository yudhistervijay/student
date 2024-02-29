package com.blogs.student.controller;


import com.blogs.student.entity.Student;
import com.blogs.student.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@Tag(name = "Student Details",description = "Student Module")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/addStudent")
    @Operation(summary = "add Student",description ="use to add the student")
    public String save(@RequestBody Student student)
    {
        Student e=service.addStudent(student);
        String message=null;
        if(e!=null) {
            message="Student data saved successfully in database";
        }
        else {
            message="student data not saved";
        }
        return message;
    }

    @GetMapping("/getAllStudents")
    public List<Student> getStudents(){
        return service.getAllStudents();
    }




}
