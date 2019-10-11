package edu.mum.cs.cs425.lab7.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.cs.cs425.lab7.domainModel.Transcript;

public interface TranscriptRepository extends CrudRepository<Transcript, Long> {

}
