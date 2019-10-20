package eTalentManagerWebApp.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import eTalentManagerWebApp.model.Athlete;
import eTalentManagerWebApp.repository.AthleteRepository;



@Service
public class AthleteServiceImpl implements AthleteService {
	
	@Autowired
	AthleteRepository athleteRepository;

	@Override
	public List<Athlete> listAllAthletes() {
		
		return athleteRepository.findAll(Sort.by("fullName"));
	}

	@Override
	public List<Athlete> listAllEliteAthletes() {
		
		 List<Athlete> elight = new ArrayList<>();
	        for (Athlete at : listAllAthletes()) {
	            if (( Period.between(at.getDateOfRegistration(), LocalDate.now()).getYears() >= 5)
	            	&&(at.getTotalNumberOfMedal()>=3)){
	            	   
	            	
	                elight.add(at);
	            }
	        }
	        return elight;				
	}
	
	

	@Override
	public Athlete addNewAthlete(Athlete athlete) {
		
		return athleteRepository.save(athlete);
	}

	
}
