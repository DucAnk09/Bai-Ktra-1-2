package com.thienit.StudentManagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.thienit.StudentManagement.models.User;


@Controller
public class UserController {
	
		@GetMapping(value = "/users")
		public String index() {
			return "users/view";
		}
	
	@GetMapping(value = "/users/register")
	public String viewRegister() {
		
		return "users/user-form";
	}
	
	@PostMapping(value = "/users/register")
	public String saveRegister(@ModelAttribute User user, Model model) {
		model.addAttribute("user", user);
	    
		return "users/view";
	}
	
}
