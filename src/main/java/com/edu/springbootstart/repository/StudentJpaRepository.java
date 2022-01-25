package com.edu.springbootstart.repository;

import com.edu.springbootstart.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJpaRepository extends JpaRepository<Student,Long> {
}
