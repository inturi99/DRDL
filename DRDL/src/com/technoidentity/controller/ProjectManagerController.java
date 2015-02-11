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

import com.technoidentity.model.ProjectManager;
import com.technoidentity.service.ProjectManagerService;
import com.technoidentity.validator.ProjectManagerLoginValidator;

@Controller
public class ProjectManagerController {
	@Autowired
	private ProjectManagerLoginValidator projectManagerLoginValidator;
	@Autowired
	private ProjectManagerService projectManagerService;

	@RequestMapping(value="/plogin",method = RequestMethod.GET)
	public ModelAndView showProjectManagerLogin(Map model, HttpSession session) {
		if (session.getAttribute("name") == null) {
			ProjectManager projectManager = new ProjectManager();
			model.put("projectManager", projectManager);
			return new ModelAndView("/projectmanagerlogin");
		} else {
			return new ModelAndView("redirect:list");
		}
	}

	@RequestMapping(value="/plogin",method = RequestMethod.POST)
	public ModelAndView processProjectManagerLogin(@Valid ProjectManager projectManager,
			BindingResult result, Map model, HttpSession session) {
		projectManagerLoginValidator.validate(projectManager, result);
		if (result.hasErrors()) {
			return new ModelAndView("/projectmanagerlogin");
		}
		List projectManagerlist = projectManagerService.getEmployeeByEmployee(projectManager.getName());
		if (projectManagerlist != null && projectManagerlist.size() > 0) {
			ProjectManager pjm1 = new ProjectManager();
			pjm1 = (ProjectManager) projectManagerlist.get(0);
			session.setAttribute("name", pjm1.getName());
		}
		session.setAttribute("name", projectManager.getName());
		return new ModelAndView("redirect:list");
	}
	
	@RequestMapping(value="/addProjectManager",method=RequestMethod.GET)
	 public String loadEmployee(Map<String,Object> map){
			map.put("projectManager", new ProjectManager());
		return "projectManager";
		  }
	@RequestMapping(value="/addProjectManager",method=RequestMethod.POST)
	public String addEmployee(@ModelAttribute("projectManager") @Valid ProjectManager projectManager,BindingResult result){
		if(result.hasErrors()){
			return "projectManager";
		}
		projectManagerService.addProjectManager(projectManager);
		return "redirect:/plogin";
	}


}
