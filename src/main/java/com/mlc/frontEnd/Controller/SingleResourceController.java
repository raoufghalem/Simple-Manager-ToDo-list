package com.mlc.frontEnd.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mlc.frontEnd.Entities.Labels;
import com.mlc.frontEnd.Entities.SingleResource;
import com.mlc.frontEnd.Services.SingleResourceService;


@Controller
//@RestController
@RequestMapping("/resource")
public class SingleResourceController {
	

	String value =null;
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
		 model.addAttribute("addresource", new SingleResource());
		 model.addAttribute("success",value);
		 value=null;
		 model.addAttribute("listOfAllResources",singleResourceService.findAll().iterator());
		 return "resources";
	}
	
	@PostMapping("/add")
	public String addSingleResource(@ModelAttribute SingleResource addresource,Model model) {
		singleResourceService.addResource(addresource);
		value="added";
		model.addAttribute("success",value);
		return "redirect:/resource/all";
	}
	
	@PostMapping("/delete")
	public String removeSingleResource(@ModelAttribute SingleResource addresource,Model model) {
		singleResourceService.removeResource(addresource);
		value="deleted";
		model.addAttribute("success",value);
		return "redirect:/resource/all";
	}
	
	
//	@GetMapping("/{id}")
//	public  Optional<SingleResource> getResouurceById2(@PathVariable Long id, Model model) {
//				
//		return  singleResourceService.findById(id);
//	}
	
	
}
