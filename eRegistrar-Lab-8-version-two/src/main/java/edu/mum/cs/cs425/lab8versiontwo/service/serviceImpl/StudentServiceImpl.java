package edu.mum.cs.cs425.lab8versiontwo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.lab8versiontwo.model.Student;
import edu.mum.cs.cs425.lab8versiontwo.repository.StudentRepository;
import edu.mum.cs.cs425.lab8versiontwo.service.StudentService;


@Service

public class StudentServiceImpl implements StudentService {
	
	
	@Autowired
	StudentRepository studentRepo;

	@Override
	public List<Student> getAllStudents() {

		return studentRepo.findAll();
				
	}

	@Override
	public Student findById(long studentId) {
		
		return studentRepo.findById(studentId).orElse(null);
	}

	@Override
	public Student addNewStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepo.delete(student);
	}

	@Override
	public void deletStudentById(long studentId) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(studentId);
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	
}
