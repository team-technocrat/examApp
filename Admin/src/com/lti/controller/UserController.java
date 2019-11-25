package com.lti.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.User;
import com.lti.services.UserService;
import com.lti.util.DateWorker;

@Controller
//@SessionAttributes("user")
public class UserController {

	HttpSession session;
	@Autowired
	UserService service;
	
	
	  @RequestMapping(value="/login",method=RequestMethod.POST) 
	  public ModelAndView login(@RequestParam String username, @RequestParam String password) {
	  
	  User incomingUser = new User(); incomingUser.setEmail(username);
	  incomingUser.setPassword(password);
	  
	  User u = service.login(incomingUser); ModelAndView model = null; if(u==null)
	  { model = new ModelAndView("loginfailed");
	  System.out.println("Login failed"); } else { model = new
	  ModelAndView("index1"); model.addObject("user",u);
	  System.out.println("Login success"); }
	  
	  return model; }
	 
	
	
	
	
	
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView addUser(@RequestParam String name, @RequestParam String email,@RequestParam String password,@RequestParam int mobile,@RequestParam String dob,@RequestParam String city,@RequestParam String state,@RequestParam String qualification,@RequestParam int yearOfCompletion)
	{
		User incomingUser = new User();
		
		incomingUser.setName(name);
		incomingUser.setEmail(email);
		incomingUser.setPassword(password);
		incomingUser.setMobile(mobile);
		incomingUser.setDob(DateWorker.formatDate(dob));
		
		incomingUser.setCity(city);
		incomingUser.setState(state);
		incomingUser.setQualification(qualification);
		incomingUser.setYearOfCompletion(yearOfCompletion);
		User u = service.addUser(incomingUser);
		ModelAndView model = null;
		if(u==null)
		{
			model = new  ModelAndView("addfailed");
		}
		else
		{
			model = new  ModelAndView("index1");
			model.addObject("user",u);
		}
		
		return model;
	}
	
	
	
	
	
}
package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Technologies;
import com.lti.model.User;
import com.lti.services.TechnologiesService;
import com.lti.services.UserService;
import com.lti.util.DateWorker;

@Controller
@SessionAttributes("user")
public class UserController {

	
	@Autowired
	UserService service;
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam String username, @RequestParam String password)
	{
		User incomingUser = new User();
		incomingUser.setEmail(username);
		incomingUser.setPassword(password);
		
		User u = service.login(incomingUser);
		ModelAndView model = null;
		if(u==null)
		{
			model = new  ModelAndView("loginfailed");
			System.out.println("Login failed");
		}
		else
		{
			model = new  ModelAndView("index1");
			model.addObject("user",u);
			System.out.println("Login success");
		}
		
		return model;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView addUser(@RequestParam String name, @RequestParam String email,@RequestParam String password,@RequestParam int mobile,@RequestParam String dob,@RequestParam String city,@RequestParam String state,@RequestParam String qualification,@RequestParam int yearOfCompletion)
	{
		User incomingUser = new User();
		
		incomingUser.setName(name);
		incomingUser.setEmail(email);
		incomingUser.setPassword(password);
		incomingUser.setMobile(mobile);
		incomingUser.setDob(DateWorker.formatDate(dob));
		
		incomingUser.setCity(city);
		incomingUser.setState(state);
		incomingUser.setQualification(qualification);
		incomingUser.setYearOfCompletion(yearOfCompletion);
		User u = service.addUser(incomingUser);
		ModelAndView model = null;
		if(u==null)
		{
			model = new  ModelAndView("addfailed");
		}
		else
		{
			model = new  ModelAndView("index1");
			model.addObject("user",u);
		}
		
		return model;
	}
	
	
	
	
	
}
