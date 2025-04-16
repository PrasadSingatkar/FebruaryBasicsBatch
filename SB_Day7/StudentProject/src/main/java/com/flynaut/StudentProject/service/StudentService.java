package com.flynaut.StudentProject.service;

import com.flynaut.StudentProject.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student addStudent(Student student);

    List<Student> getAllStudents();

    Optional<Student> getStudentById(int id);

    Student updateStudent(int id, Student student);

    void deleteStudent(int id);
}
