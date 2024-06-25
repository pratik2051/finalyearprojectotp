package com.example.studentproject.controller;

import com.example.studentproject.model.Student;
import com.example.studentproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/rest-api")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private SecurityProperties securityProperties;

    @PostMapping("/addstudent")
    public Student saveStudent( @RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/getstudent")
    public List<Student> findAllStudents() {
        return studentService.fetchStudentList();
    }

//    public Student findStudentByID(int id){
//        return StudentService.getStudentById(id);
//    }

    @DeleteMapping("/student/{id}")
    public String deleteStudentById(@PathVariable("id") long studentId) {
        studentService.deleteStudentById(studentId);
        return "Deleted Successfully";
    }
}
