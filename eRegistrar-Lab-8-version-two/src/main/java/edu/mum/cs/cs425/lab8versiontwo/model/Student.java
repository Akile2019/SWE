package edu.mum.cs.cs425.lab8versiontwo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "studentId")
	private int studentId;
	
	@NotBlank(message = "Student number required")
	@Column(name = "Student_Number", nullable = false, unique = true)
	private String studentNumber;
	
	@Column(name = "First_Name", nullable = false)
	private String firstName;
	private String middleName;
	
	@Column(name = "Last_Name", nullable = false)
	private String lastName;
	
	private float cgpa;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "Enrollment_Date")
	private LocalDate enrollmentDate;
	
//	@Column(name = "IsInternational", nullable = false)
//	private  isInternational;

	public Student() {
		
	}

	public Student(@NotBlank(message = "Student number required") String studentNumber, String firstName,
			String middleName, String lastName, float cgpa, LocalDate enrollmentDate) {//, String isInternational) {
		super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.enrollmentDate = enrollmentDate;
		//this.isInternational = isInternational;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

//	public String isInternational() {
//		return isInternational;
//	}
//
//	public void setInternational(String isInternational) {
//		this.isInternational = isInternational;
//	}
	

}
