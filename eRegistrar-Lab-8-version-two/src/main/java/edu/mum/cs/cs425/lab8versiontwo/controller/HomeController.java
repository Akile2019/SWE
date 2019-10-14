package edu.mum.cs.cs425.lab8versiontwo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	
	@GetMapping(value = {"/", "/eRegistrar/home", "index"})
	
	public String displayIndexPage() {
		
		return "index";
	}
	
	

}
