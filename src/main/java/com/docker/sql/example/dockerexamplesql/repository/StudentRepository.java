package com.docker.sql.example.dockerexamplesql.repository;

import com.docker.sql.example.dockerexamplesql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}