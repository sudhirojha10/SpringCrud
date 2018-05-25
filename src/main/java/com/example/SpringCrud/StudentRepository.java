package com.example.SpringCrud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringCrud.entity.Student;

// TODO: Auto-generated Javadoc
/**
 * The Interface StudentRepository.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	/**
	 * Gets the student by email.
	 *
	 * @param email the email
	 * @return the student by email
	 */
	public Student findStudentByEmail(String email);
}
