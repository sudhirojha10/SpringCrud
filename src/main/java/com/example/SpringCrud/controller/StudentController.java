package com.example.SpringCrud.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringCrud.URL.URLMapping;
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
	@RequestMapping(value = URLMapping.CREATE_STUDENT , method = RequestMethod.POST)
	public Map<String, Object> createStudent(@RequestBody Student student){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			result.putAll(studentService.createStudent(student));
			return ResponseHandler.generateResponse(HttpStatus.OK, false, "success", result);
		}catch(Exception exception){
			return ResponseHandler.generateResponse(HttpStatus.INTERNAL_SERVER_ERROR, true, "error", result);
		}
	}
	
	/**
	 * Update student.
	 *
	 * @param student the student
	 * @return the map
	 */
	@RequestMapping(value = URLMapping.UPDATE_STUDENT , method = RequestMethod.PUT)
	public Map<String, Object> updateStudent(@RequestBody Student student){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			result.putAll(studentService.updateStudent(student));
			return ResponseHandler.generateResponse(HttpStatus.OK, false, "success", result);
		}catch(Exception exception){
			return ResponseHandler.generateResponse(HttpStatus.INTERNAL_SERVER_ERROR, true, "error", result);
		}
	}
	
	/**
	 * Delete student.
	 *
	 * @param studentId the student id
	 * @return the map
	 */
	@RequestMapping(value = URLMapping.DELETE_STUDENT , method = RequestMethod.DELETE)
	public Map<String, Object> deleteStudent(@RequestParam("studentId") String studentId){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			result.putAll(studentService.deleteStudent(studentId));
			return ResponseHandler.generateResponse(HttpStatus.OK, false, "success", result);
		}catch(Exception exception){
			return ResponseHandler.generateResponse(HttpStatus.INTERNAL_SERVER_ERROR, true, "error", result);
		}
	}
	
	/**
	 * Find all student.
	 *
	 * @return the map
	 */
	@RequestMapping(value = URLMapping.FIND_ALL_STUDENT , method = RequestMethod.GET)
	public Map<String, Object> findAllStudent(){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			result.putAll(studentService.findAllStudent());
			return ResponseHandler.generateResponse(HttpStatus.OK, false, "success", result);
		}catch(Exception exception){
			return ResponseHandler.generateResponse(HttpStatus.INTERNAL_SERVER_ERROR, true, "error", result);
		}
	}
	
	/**
	 * Find one student.
	 *
	 * @param studentId the student id
	 * @return the map
	 */
	@RequestMapping(value = URLMapping.FIND_ONE_STUDENT , method = RequestMethod.GET)
	public Map<String, Object> findOneStudent(@RequestParam("studentId") String studentId){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			if(studentId != null){
				result.putAll(studentService.findOneStudent(studentId));
			}else{
				result.put("responseMessage", "error");
				result.put("errorMessage", "studentId can't be null.");
			}
			return ResponseHandler.generateResponse(HttpStatus.OK, false, "success", result);
		}catch(Exception exception){
			exception.printStackTrace();
			return ResponseHandler.generateResponse(HttpStatus.INTERNAL_SERVER_ERROR, true, "error", result);
		}
	}
}
