package com.mlc.frontEnd.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mlc.frontEnd.Services.SingleResourceService;


@Controller
//@RestController
@RequestMapping("/resource")
public class SingleResourceController {
	

	
	SingleResourceService singleResourceService;
	public SingleResourceController(SingleResourceService singleResourceService) {
		this.singleResourceService = singleResourceService;
	}
	
	@GetMapping("/byName")
	public String getResourceByName(@RequestParam String search, Model model) {
		model.addAttribute("res",singleResourceService.findByName(search));		
		return "singleResource";	
	}
	
	@GetMapping("/byId/{id}")
	public String getResourceById(@PathVariable Long id, Model model) {
		model.addAttribute("res",singleResourceService.findById(id));		
		return "singleResource";	
	}
	@GetMapping("/all")
	public  String  getAllResources(Model model) {		 
		 model.addAttribute("listOfAllResources",singleResourceService.findAll().iterator());
		 return "resources";
	}
	
	
//	@GetMapping("/{id}")
//	public  Optional<SingleResource> getResouurceById2(@PathVariable Long id, Model model) {
//				
//		return  singleResourceService.findById(id);
//	}
	
	
}
