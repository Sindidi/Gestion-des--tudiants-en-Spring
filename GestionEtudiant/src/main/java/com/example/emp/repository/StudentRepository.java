package com.example.emp.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.example.emp.domain.Student;
 
 
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
 
}