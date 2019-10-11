package edu.mum.cs.cs425.lab7.domainModel;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Course_Id")
	private int courseId;
	@Column(name = "Course_Title")
	private String title;
	
	
	
	
	public Course() {
		super();
	}

	public Course( String title) {
		super();
	
		this.title = title;
	}



	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
