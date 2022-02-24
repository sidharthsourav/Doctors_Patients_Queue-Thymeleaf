package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.services.PatientService;

@Controller
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("patientList",patientService.getallpatients() );
		return "index";
	}
}
