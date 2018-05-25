package com.example.SpringCrud.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringCrud.entity.Student;
import com.example.SpringCrud.service.StudentService;
import com.example.SpringCrud.util.ResponseHandler;

// TODO: Auto-generated Javadoc
/**
 * The Class StudentController.
 */
@RestController
public class StudentController {
	
	/** The student service. */
	@Autowired
	private StudentService studentService;
	
	/**
	 * Creates the student.
	 *
	 * @param student the student
	 * @return the map
	 */
	public Map<String, Object> createStudent(@RequestBody Student student){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			result.putAll(studentService.createStudent(student));
			return ResponseHandler.generateResponse(HttpStatus.OK, false, "success", result);
		}catch(Exception exception){
			return ResponseHandler.generateResponse(HttpStatus.INTERNAL_SERVER_ERROR, true, "error", result);
		}
	}
}
