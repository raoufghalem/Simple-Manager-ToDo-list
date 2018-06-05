package com.mlc.frontEnd.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mlc.frontEnd.Repositories.ListOfResourcesRepository;


@Controller
@RequestMapping("/lists")
public class ListOfResourcesController {
	

	
	ListOfResourcesRepository listOfResourcesRepository;
	public ListOfResourcesController(ListOfResourcesRepository listOfResourcesRepository) {
		this.listOfResourcesRepository = listOfResourcesRepository;
	}
	
	
	
	@GetMapping("/all")
	public  String  getAllResources(Model model) {		 
		 model.addAttribute("listOfResources",listOfResourcesRepository.findAll());
		 return "lists";
	}
	
	
}
