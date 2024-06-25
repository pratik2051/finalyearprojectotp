package com.example.studentproject.service.impl;

import com.example.studentproject.model.Student;
import com.example.studentproject.repository.StudentRepository;
import com.example.studentproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private  StudentRepository studentrepository;
    @Override
    public Student saveStudent(Student student) {
        return studentrepository.save(student);
    }

    @Override
    public List<Student> fetchStudentList() {
       return studentrepository.findAll();
    }

    @Override
    public Student updateDepartment(Student student, Long studentId) {
        return null;
    }

    @Override
    public Student updatestudent(Student student, Long studentId) {
        return null;
    }

    @Override
    public void deleteStudentById(Long StudentId) {
        studentrepository.deleteById(StudentId);
    }
}

   /* @Autowired
    private StudentRepository studentrepository;
    @Override
    public Student saveStudent(Student student) {
     return  studentrepository.save(student);

    }

    @Override
    public List<Student> fetchStudentList() {
        return (List<Student>)
                studentrepository.findAll();
    }

    @Override
    public Student updateDepartment(Student student, Long studentId) {
        return null;
    }

    @Override
    public Student updatestudent(Student student, Long studentId)
    {
        return null;
    }

    // Delete operation
    @Override
    public void deleteStudentById(Long studentId)
    {
      studentrepository.deleteById(studentId);
    }*/


/*
    @Override
    public void deleteStudentById(Long StudentId) {
        studentrepository.deleteById(StudentId);
*/




