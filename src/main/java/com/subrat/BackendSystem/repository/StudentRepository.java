package com.subrat.BackendSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.BackendSystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
