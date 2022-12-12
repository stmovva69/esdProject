package com.example.travelapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.example.travelapp.dao.TravelPostDAO;
import com.example.travelapp.pojo.TravelPost;
import com.example.travelapp.pojo.User;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TravelPostController {
@Autowired	
TravelPostDAO travelPostDao;

@GetMapping("/listTravelPosts.htm")
public String listAdvertsGet(HttpServletRequest request,ModelMap model,User user) {
	request.setAttribute("TravelPosts", travelPostDao.list());
	model.addAttribute("user", user);
	return "viewTravelPosts";
}

@GetMapping("/addTravelPost.htm")
public String addAdvertGet(ModelMap model, TravelPost TravelPost,User user) {
	model.addAttribute("TravelPost", TravelPost);
	// return form view
	model.addAttribute("user", user);
	return "addTravelPostForm";
}
@GetMapping("/{id}.htm")
public ModelAndView deleteTravelPost(@PathVariable("id")String id,HttpServletRequest request) throws Exception{
	TravelPost tp=travelPostDao.deletePostByID(id);
	return new ModelAndView("menu");
}
@PostMapping("/addTravelPost.htm")
public String addTravelPost(@ModelAttribute("TravelPost") TravelPost TravelPost, BindingResult result, SessionStatus status,ModelMap model,User user) {
	

	try {
		travelPostDao.save(TravelPost);
	} catch (Exception e) {
		System.out.println("TravelPost cannot be Added: " + e.getMessage());
	}
	
	status.setComplete();
	model.addAttribute("user", user);//mark it complete
	return "addedTravelPost";
}
}
//select name from User"select name from User"