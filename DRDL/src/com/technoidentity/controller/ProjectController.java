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

import com.technoidentity.dto.ProjectDto;
import com.technoidentity.service.ProjectService;

@Controller
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	@RequestMapping(value="/addProject",method=RequestMethod.GET)
	 public String loadProject(Map<String,Object> map){
			map.put("projectDto", new ProjectDto());
		return "project";
		  }
	@RequestMapping(value="/addProject",method=RequestMethod.POST)
	public String addProject(@ModelAttribute("projectDto") @Valid ProjectDto projectDto,BindingResult result){
		projectService.addProject(projectDto);
		return "redirect:/pList";
	}
	@RequestMapping("/pList")
	public String listProject(Map<String, Object> map) {
		// map.put("employee", new Employee());
		map.put("pList", projectService.listProject());
		return "projectlist";
	}
	@RequestMapping(value = "/editProject", method = RequestMethod.GET)
	public String geteditProjectManagerId(
			@RequestParam(value = "projectId", required = true) String projectId, Model model) {
		model.addAttribute("projectDto", projectService.getProjectId(projectId));
		return "editproject";
	}

	@RequestMapping(value = "/editProject", method = RequestMethod.POST)
	public String updateeditProject(@ModelAttribute("projectDto") ProjectDto projectDto,
			@RequestParam(value = "projectId", required = true) String projectId, Model model) {
		projectDto.setProjectId(projectId);
		projectService.updateProject(projectDto);
		model.addAttribute("id", projectId);
		return "redirect:/pList";
	}
	@RequestMapping("/deleteProject/{projectId}")
	public String deleteProjectManager(@PathVariable("projectId") Integer projectId) {
		projectService.removeProject(projectId);
		return "redirect:/pList";
	}
}
