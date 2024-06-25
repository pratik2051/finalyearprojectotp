package com.example.studentproject.service;

import com.example.studentproject.model.Student;

import java.util.List;

public interface StudentService {
    // Save operation
    Student saveStudent(Student student);

    // Read operation
    List<Student> fetchStudentList();


    // Update operation
 Student updateDepartment(Student student,
                                Long studentId);

    Student updatestudent(Student student, Long studentId);

    // Delete operation
    void deleteStudentById(Long StudentId);
}
