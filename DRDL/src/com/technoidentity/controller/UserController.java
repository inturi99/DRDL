package com.technoidentity.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.technoidentity.model.User;
import com.technoidentity.service.UserService;
import com.technoidentity.validator.UserLoginValidator;

@Controller
public class UserController {
	@Autowired
	private UserLoginValidator userLoginValidator;
	@Autowired
	private UserService userService;

	@RequestMapping(value="/login",method = RequestMethod.GET)
	public ModelAndView showUserLogin(Map model, HttpSession session) {
		if (session.getAttribute("name") == null) {
			User user = new User();
			model.put("user", user);
			return new ModelAndView("/userlogin");
		} else {
			return new ModelAndView("redirect:list");
		}
	}

	@RequestMapping(value="/login",method = RequestMethod.POST)
	public ModelAndView processUserLogin(@Valid User user,
			BindingResult result, Map model, HttpSession session) {
		userLoginValidator.validate(user, result);
		if (result.hasErrors()) {
			return new ModelAndView("/userlogin");
		}
		List userlist = userService.getUserByUser(user.getName());
		if (userlist != null && userlist.size() > 0) {
			User usr = new User();
			usr = (User) userlist.get(0);
			session.setAttribute("name", usr.getName());
		}
		session.setAttribute("name", user.getName());
		return new ModelAndView("redirect:list");
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.GET)
	 public String loadUser(Map<String,Object> map){
			map.put("user", new User());
		return "user";
		  }
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user") @Valid User user,BindingResult result){
		if(result.hasErrors()){
			return "user";
		}
		userService.addUser(user);
		return "redirect:/login";
	}

		@RequestMapping(value="/logout",method = RequestMethod.GET)
		public ModelAndView logOut(HttpSession session) {
			session.invalidate();
			return new ModelAndView("redirect:login");
		}


}
