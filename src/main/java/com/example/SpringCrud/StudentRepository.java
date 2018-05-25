package com.example.SpringCrud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringCrud.entity.Student;

/**
 * The Interface StudentRepository.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
