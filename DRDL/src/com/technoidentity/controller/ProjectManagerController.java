package com.technoidentity.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.technoidentity.model.ProjectManager;
import com.technoidentity.service.ProjectManagerService;

@Controller
public class ProjectManagerController {
	@Autowired
	private ProjectManagerService projectManagerService;
	@RequestMapping(value="/addProjectManager",method=RequestMethod.GET)
	 public String loadProjectManager(Map<String,Object> map){
			map.put("projectManager", new ProjectManager());
		return "projectmanager";
		  }
	@RequestMapping(value="/addProjectManager",method=RequestMethod.POST)
	public String addProjectManager(@ModelAttribute("projectManager") @Valid ProjectManager projectManager,BindingResult result){
		if(result.hasErrors()){
			return "projectmanager";
		}
		projectManagerService.addProjectManager(projectManager);
		return "redirect:/pmList";
	}
	@RequestMapping("/pmList")
	public String listProjectManager(Map<String, Object> map) {
		// map.put("employee", new Employee());
		map.put("pmList", projectManagerService.listProjectManagers());
		return "projectmanagerlist";
	}
	@RequestMapping(value = "/editProjectManager", method = RequestMethod.GET)
	public String geteditProjectManagerId(
			@RequestParam(value = "id", required = true) Integer id, Model model) {
		model.addAttribute("projectManager", projectManagerService.getProjectManagerId(id));
		return "editprojectmanager";
	}

	@RequestMapping(value = "/editProjectManager", method = RequestMethod.POST)
	public String updateeditProjectManager(@ModelAttribute("projectManager") ProjectManager projectManager,
			@RequestParam(value = "id", required = true) Integer id, Model model) {
		projectManager.setId(id);
		projectManagerService.updateProjectManager(projectManager);;
		model.addAttribute("id", id);
		return "redirect:/pmList";
	}
	@RequestMapping("/deleteProjectManager/{projectManagerId}")
	public String deleteProjectManager(@PathVariable("projectManagerId") Integer projectManagerId) {
		projectManagerService.removeProjectManager(projectManagerId);
		return "redirect:/pmList";
	}
}
