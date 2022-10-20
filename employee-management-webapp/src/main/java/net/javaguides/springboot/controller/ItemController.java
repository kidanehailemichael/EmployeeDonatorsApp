package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.springboot.model.Donator;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Item;
import net.javaguides.springboot.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	//Display list of items
	
	@GetMapping("/itemlist")
	public String viewItemPage(Model model) {
		model.addAttribute("itemList", itemService.getAllItem());
		return "viewitem";
	}
	
	@GetMapping("/showNewItemForm")
	public String showNewItemForm(Model model) {
		//Create model attribute to bind item new form data
		Item item = new Item();
		//Thymleaf template will access this empty item object for binding form data
		model.addAttribute("item", item);
		return "new_item";
		
		
	}
	
@PostMapping("/saveItem")
	
	public String saveItem(@ModelAttribute("item") Item item) {
		//Save employee to the database
		itemService.saveItem(item);
		return "redirect:/itemlist";
		
	}

}
