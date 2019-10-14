package edu.mum.cs.cs425.lab8versiontwo.service;

import java.util.List;

import edu.mum.cs.cs425.lab8versiontwo.model.Student;


public interface StudentService {
	
	//Iterable<Student> getAllStudents();  //we use iterable inorder to use for each
	
	List<Student> getAllStudents();
	Student findById(long studentId);
	Student addNewStudent(Student student);
	void deleteStudent(Student student);
	void deletStudentById(long studentId);	
	Student update(Student student);
	
	//Page<Student> getAllBooksPaged(int pageNo);


}
