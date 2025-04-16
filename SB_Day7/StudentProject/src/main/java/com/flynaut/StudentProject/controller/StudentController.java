package com.flynaut.StudentProject.controller;

import com.flynaut.StudentProject.entity.Student;
import com.flynaut.StudentProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    //TASK: create method to add multiple students

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id,@RequestBody Student student){
        try {
            return ResponseEntity.ok(studentService.updateStudent(id,student));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return ResponseEntity.ok("Student Deleted Successfully!!");
    }

}
