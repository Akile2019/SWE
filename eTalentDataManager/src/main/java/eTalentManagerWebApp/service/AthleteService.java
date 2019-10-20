package eTalentManagerWebApp.service;

import java.util.List;

import eTalentManagerWebApp.model.Athlete;

public interface AthleteService {
	
	List<Athlete> listAllAthletes();
	List<Athlete> listAllEliteAthletes();
	Athlete addNewAthlete(Athlete athlete);

}
