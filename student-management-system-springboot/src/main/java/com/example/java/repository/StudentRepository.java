package com.example.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
