package edu.mum.cs.cs425.lab7.domainModel;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Student_Id")
	private long studentId;
	@Column(name = "Student_Number", nullable = false)
	private String studentNumber;
	@Column(name = "First_Name", nullable = false)
	private String firstName;
	@Column(name = "Middle_Name", nullable = true)
	private String middleName;
	@Column(name = "Last_Name", nullable = false)
	private String lastName;
	@Column(name = "Course_Gpa", nullable = true)
	private float cgpa;

	@Column(name = "Date_Enrollment")
	private LocalDate dateInrollment;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "transcriptId")
	private Transcript transcript;
	// @JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "classroomId")
	private Classroom classroom;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "Student_Course",
			joinColumns = {@JoinColumn(name = "Student_Id")},
			inverseJoinColumns = {@JoinColumn(name= "Course_Id")})
	List<Course> cList;

	public Student() {

	}

	public Student(String studentNumber, String firstName, String middleName, String lastName, float cgpa,
			LocalDate dateInrollment) {
		super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateInrollment = dateInrollment;
	}

	public Transcript getTranscript() {
		return transcript;
	}

	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
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

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	public LocalDate getDateInrollment() {
		return dateInrollment;
	}

	public void setDateInrollment(LocalDate dateInrollment) {
		this.dateInrollment = dateInrollment;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public List<Course> getcList() {
		return cList;
	}

	public void setcList(List<Course> cList) {
		this.cList = cList;
	}
	
	

}
