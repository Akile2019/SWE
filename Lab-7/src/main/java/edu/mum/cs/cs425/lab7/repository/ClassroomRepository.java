package edu.mum.cs.cs425.lab7.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.cs.cs425.lab7.domainModel.Classroom;

public interface ClassroomRepository extends CrudRepository<Classroom, Long> {

}
