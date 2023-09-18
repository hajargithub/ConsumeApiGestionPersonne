package com.codingTech.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingTech.entity.Personne;
import com.codingTech.service.PersonApiService;


@Controller
public class PersonneController {
	
	 private  PersonApiService persoApiService=new  PersonApiService();
	@RequestMapping("/afficherPersonnes")
	 public String afficherPersonnes(Model model) {
		List<Personne>ListP=persoApiService.getPersonnes();
		model.addAttribute("listP",ListP);
		 return "personnes";
	 }
   

}
