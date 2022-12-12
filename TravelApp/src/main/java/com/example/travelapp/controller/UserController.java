package com.example.travelapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.example.travelapp.dao.UserDAO;
import com.example.travelapp.pojo.User;


@Controller
public class UserController {
	@GetMapping("/login")
	public ModelAndView login(ModelMap model,User user) {
		//return new ModelAndView("menu");
		model.addAttribute("user", user);
		return new ModelAndView("login");
	}
	@PostMapping("/login")
	public ModelAndView LoginPost(ModelMap model,@ModelAttribute("user") User user, BindingResult result, SessionStatus status, UserDAO userdao) {
		
			User u = null;
			try {
				u = userdao.login(user.getUsername(),user.getPassword());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(u==null) {
				status.setComplete();
				
				return new ModelAndView("login");
			}
			else {
				status.setComplete();
				model.addAttribute("user", user);
				return new ModelAndView("menu");
			}
		
		
		 //mark it complete
		 
	}
	@GetMapping("/menu.htm")
	public ModelAndView backtomenu() {
		return new ModelAndView("menu");
	}
	

	@GetMapping("/adduser.htm")
	public ModelAndView  addUserGet(ModelMap model, User user) {
		// command object
		model.addAttribute("user", user);

		// return form view
		return new ModelAndView("addUserForm");
	}

	@PostMapping("/adduser.htm")
	public ModelAndView addUserPost(ModelMap model,@ModelAttribute("user") User user, BindingResult result, SessionStatus status, UserDAO userdao) {
		try {
			userdao.save(user);
		} catch (Exception e) {
			System.out.println("User cannot be Added: " + e.getMessage());
		}
		
		status.setComplete(); //mark it complete
		model.addAttribute("user", user);
		return new ModelAndView("addedUser");
	}
	
	
}
