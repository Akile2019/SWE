package eTalentManagerWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import eTalentManagerWebApp.model.Athlete;
import eTalentManagerWebApp.service.AthleteService;

@Controller

public class AthleteCntroller {
	
	@Autowired
	AthleteService athleteService;
	
	@GetMapping(value = "home")
	public String displayHomePage() {
		return "index";
	}
	
	
	@GetMapping(value = "/athlete/list")
	public String athletesList(Model model) {
		
		List<Athlete> athletes = athleteService.listAllAthletes();
		model.addAttribute("athletes", athletes);
		return "athlete/list";
	}
	
	
	@GetMapping(value = "/athlete/new")
	public String addNewAthleteForm(Model model) {
		model.addAttribute("athlete", new Athlete());
		return "athlete/new";
	}
	
	@PostMapping(value = "/athlete/new")
	
	public String addNewAthleth(@ModelAttribute("athlete") Athlete athlete) {
		
		athleteService.addNewAthlete(athlete);
		return "redirect:/athlete/list";
		
	}
	
	
	@GetMapping(value = "/athlete/eliteList")
	public String eliteAthletesList(Model model) {
		
		List<Athlete> athletes = athleteService.listAllEliteAthletes();
		model.addAttribute("athletes", athletes);
		return "athlete/eliteList";
	}
	
	

	
	

}
