package com.example.SpringCrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Student.
 */
@Entity
public class Student {
	
	/** The student id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;
	
	/** The first name. */
	private String firstName;
	
	/** The Last name. */
	private String LastName;
	
	/** The father name. */
	private String fatherName;
	
	/** The mother name. */
	private String motherName;
	
	/** The gender. */
	private String gender;
	
	/** The course. */
	private String course;
	
	/** The d OB. */
	private Long dOB;
	
	/** The full address. */
	private String fullAddress;
	
	/** The email. */
	@Column(unique = true)
	private String email;
	
	/** The mobile number. */
	private Long mobileNumber;
	
	/** The joining date. */
	@Column(updatable = false)
	private Long joiningDate;
	
	/**
	 * Gets the student id.
	 *
	 * @return the student id
	 */
	public Long getStudentId() {
		return studentId;
	}
	
	/**
	 * Sets the student id.
	 *
	 * @param studentId the new student id
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return LastName;
	}
	
	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	/**
	 * Gets the father name.
	 *
	 * @return the father name
	 */
	public String getFatherName() {
		return fatherName;
	}
	
	/**
	 * Sets the father name.
	 *
	 * @param fatherName the new father name
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	/**
	 * Gets the mother name.
	 *
	 * @return the mother name
	 */
	public String getMotherName() {
		return motherName;
	}
	
	/**
	 * Sets the mother name.
	 *
	 * @param motherName the new mother name
	 */
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	
	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Gets the course.
	 *
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	
	/**
	 * Sets the course.
	 *
	 * @param course the new course
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	
	/**
	 * Gets the d OB.
	 *
	 * @return the d OB
	 */
	public Long getdOB() {
		return dOB;
	}
	
	/**
	 * Sets the d OB.
	 *
	 * @param dOB the new d OB
	 */
	public void setdOB(Long dOB) {
		this.dOB = dOB;
	}
	
	/**
	 * Gets the full address.
	 *
	 * @return the full address
	 */
	public String getFullAddress() {
		return fullAddress;
	}
	
	/**
	 * Sets the full address.
	 *
	 * @param fullAddress the new full address
	 */
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Gets the mobile number.
	 *
	 * @return the mobile number
	 */
	public Long getMobileNumber() {
		return mobileNumber;
	}
	
	/**
	 * Sets the mobile number.
	 *
	 * @param mobileNumber the new mobile number
	 */
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * Gets the joining date.
	 *
	 * @return the joining date
	 */
	public Long getJoiningDate() {
		return joiningDate;
	}

	/**
	 * Sets the joining date.
	 *
	 * @param joiningDate the new joining date
	 */
	public void setJoiningDate(Long joiningDate) {
		this.joiningDate = joiningDate;
	}
}
