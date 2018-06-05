package com.mlc.frontEnd.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mlc.frontEnd.Entities.Labels;
import com.mlc.frontEnd.Services.LabelsService;

@Controller
@RequestMapping("labels")
public class LabelsController {

	String value =null;
	LabelsService labelsService;
	public LabelsController(LabelsService labelsService) {
		this.labelsService = labelsService;
	}



	@RequestMapping("/all")
	public String getAll(Model model){
		
		 model.addAttribute("addlabel", new Labels());
		 model.addAttribute("success",value);
		 value=null;
		 model.addAttribute("labels", labelsService.findall());
		return "labels";
	}
	
	
	@RequestMapping("/byName")
	public String getById(@RequestParam String label, Model model){
		model.addAttribute("addlabel", new Labels());
		model.addAttribute("labels",labelsService.findByName(label));
		return "labels";
	}
	
	

	@PostMapping("/add")
	public String addLabel(@ModelAttribute Labels addlabel,Model model) {
		labelsService.addLabel(addlabel);	
		value="added";
		return "redirect:/labels/all";
	}
	
//	@PostMapping("/delete")
//	public String deleteLabel(@ModelAttribute("removelabels") Labels addlabel,Model model, BindingResult result) {
//		labelsService.deleteLabel(addlabel);	
//		
//		System.out.println(addlabel.getLabelName() + " binding" + result.getObjectName());
//		
//		model.addAttribute("success","delete");
//		return "redirect:/labels/all";
//	}
	
	@PostMapping("/delete")
	public String deleteLabel(@ModelAttribute Labels addlabel, Model model) {
		labelsService.deleteLabel(addlabel);
		value="deleted";
		return "redirect:/labels/all";
	}
	
	
	@PostMapping("/update")
	public String updateLabel(@ModelAttribute Labels addlabel,Model model) {
		labelsService.addLabel(addlabel);	
		value = "updated";
		return "redirect:/labels/all";
	}
	
}
