package edu.mum.cs.cs425.lab7.domainModel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classroom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="classroomId", nullable = false)
	private long Id;
	
	@Column(name = "Building_Name")
	private String buildingName;
	@Column(name = "Room_Number")
	private int roomNumber;
	
	@OneToMany(mappedBy = "classroom")
	private List<Student> sList ;
	
	
	public Classroom(String buildingName, int roomNumber) {
		super();
		
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public long getClassroomId() {
		return Id;
	}
	public void setClassroomId(long classroomId) {
		this.Id = classroomId;
	}
	public List<Student> getsList() {
		return sList;
	}
	public void setsList(List<Student> sList) {
		this.sList = sList;
	}
		
}
