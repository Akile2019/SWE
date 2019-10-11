package edu.mum.cs.cs425.lab7.domainModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transcript {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transcriptId;
	@Column(name = "Degree_Title")
	private String degreeTitle;
	
	public Transcript() {
		
	}
	
	
	

	public Transcript(String degreeTitle) {
		super();
		this.degreeTitle = degreeTitle;
	}




	public String getDegreeTitle() {
		return degreeTitle;
	}

	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	public long getTranscriptId() {
		return transcriptId;
	}

	public void setTranscriptId(long transcriptId) {
		this.transcriptId = transcriptId;
	}
	
	
	
	
}
