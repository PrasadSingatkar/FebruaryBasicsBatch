package com.flynaut.StudentProject.repository;

import com.flynaut.StudentProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository   //Marking this interface as Spring Data Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
