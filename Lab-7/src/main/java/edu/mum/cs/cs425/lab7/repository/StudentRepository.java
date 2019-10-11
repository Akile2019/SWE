package edu.mum.cs.cs425.lab7.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.cs.cs425.lab7.domainModel.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
