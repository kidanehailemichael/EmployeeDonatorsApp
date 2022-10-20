package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.springboot.model.Donator;
import net.javaguides.springboot.service.DonatorService;

@Controller
public class DonatorController {
	@Autowired
	private DonatorService donatorService;
	
	@GetMapping("/donorlist")
	public String viewDonatorPage(Model model) {
		model.addAttribute("listDonator", donatorService.getAllDonator());
		return "viewdonator";
	}
	
	@GetMapping("/showNewDonorForm")
	public String showNewDonorForm(Model model) {
		//Create model attribute to bind donor new form data
		Donator donor = new Donator();
		//Thymleaf template will access this empty employee object for binding form data
		model.addAttribute("donor", donor);
		return "new_donor";
		
		
	}
	
@PostMapping("/saveDonor")
	
	public String saveDonor(@ModelAttribute("donor") Donator donator) {
		//Save employee to the database
	
		donatorService.saveDonor(donator);
		return "redirect:/donorlist";
		
	}
@GetMapping("/showFormForupdate/{id}")

public String showFormForUpdate(@PathVariable(value="id") long id, Model model) {
	
	//Get donor from the service
	
	Donator donator =donatorService.getDonatorById(id);
	
	//Set donor as model attribute to pre-populate the form
	model.addAttribute("donator", donator);
	return "update_donator";
	
	
	
}
@GetMapping("/deleteDonor/{id}")
public String deleteDonor(@PathVariable(value="id") long id) {
	
	this.donatorService.deleteDonatorById(id);
	return "redirect:/donorlist";
	
	
	
}

}
