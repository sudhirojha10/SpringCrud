package com.example.SpringCrud.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.SpringCrud.StudentRepository;
import com.example.SpringCrud.entity.Student;

// TODO: Auto-generated Javadoc
/**
 * The Class StudentService.
 */
@Service
public class StudentService {
	
	/** The student repository. */
	@Autowired
	private StudentRepository studentRepository;
	
	/**
	 * Creates the student.
	 *
	 * @param student the student
	 * @return the map
	 */
	public Map<String, Object> createStudent(@RequestBody Student student){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			Student found = studentRepository.findStudentByEmail(student.getEmail());
			if(found == null){
				student.setJoiningDate(new Date().getTime());
				Student created = studentRepository.save(student);
				result.put("responseMessage", "success");
				result.put("successMessage", "Student data is saved successfully. The studentId generated by system is "+ created.getStudentId() +". Please keep it for future reference.");
			}else{
				result.put("responseMessage", "error");
				result.put("errorMessage", "A student already registered with email "+ student.getEmail() +". Please use different email.");
			}
		}catch(Exception exception){
			result.put("responseMessage", "error");
			result.put("errorMessage", "Something went wrong plase try after sometimes.");
		}
		return result;
	}
	
	/**
	 * Update student.
	 *
	 * @param student the student
	 * @return the map
	 */
	public Map<String, Object> updateStudent(@RequestBody Student student){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			boolean found = studentRepository.existsById(student.getStudentId());
			if(found){
				studentRepository.save(student);
				result.put("responseMessage", "success");
				result.put("successMessage", "Student data is updated successfully.");
			}else{
				result.put("responseMessage", "error");
				result.put("errorMessage", "A student is not found with studentId "+ student.getStudentId());
			}
		}catch(Exception exception){
			result.put("responseMessage", "error");
			result.put("errorMessage", "Something went wrong plase try after sometimes.");
		}
		return result;
	}
	
	/**
	 * Delete student.
	 *
	 * @param studentId the student id
	 * @return the map
	 */
	public Map<String, Object> deleteStudent(String studentId){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			boolean found = studentRepository.existsById(Long.parseLong(studentId));
			if(found){
				studentRepository.deleteById(Long.parseLong(studentId));
				result.put("responseMessage", "success");
				result.put("successMessage", "Student data is deleted successfully.");
			}else{
				result.put("responseMessage", "error");
				result.put("errorMessage", "A student is not found with studentId "+ studentId);
			}
		}catch(Exception exception){
			result.put("responseMessage", "error");
			result.put("errorMessage", "Something went wrong plase try after sometimes.");
		}
		return result;
	}
	
	/**
	 * Find all student.
	 *
	 * @return the map
	 */
	public Map<String, Object> findAllStudent(){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			List<Student> studentList = studentRepository.findAll();
			result.put("list", studentList);
		}catch(Exception exception){
			result.put("responseMessage", "error");
			result.put("errorMessage", "Something went wrong plase try after sometimes.");
		}
		return result;
	}
}
