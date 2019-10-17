package edu.mum.cs.cs425.lab8versiontwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mum.cs.cs425.lab8versiontwo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

		
}
