package com.technoidentity.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.technoidentity.dto.SalaryTypeDto;
import com.technoidentity.service.EmployeeService;
import com.technoidentity.service.SalaryTypeService;
@Controller
public class SalaryTypeController {
	@Autowired
	private SalaryTypeService salaryTypeService;
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/loadSalaryType",method=RequestMethod.GET)
	public ModelAndView load(Map<String, Object> map,HttpServletRequest request){
		map.put("list", employeeService.listEmployees());	
		map.put("salaryTypeDto", new SalaryTypeDto());
		return new ModelAndView("/salarytype");
	}
	@RequestMapping(value="/loadSalaryType/{employeeNumber}/{name}",method=RequestMethod.GET)
	public ModelAndView loadByemployeeNumberandName(@PathVariable("employeeNumber") String employeeNumber,@PathVariable("name") String name,ModelMap model){
	model.put("salarytypes",salaryTypeService.findBySalaryType(employeeNumber, name));
	model.put("list", employeeService.listEmployees());
	return new ModelAndView("/salarytypesearch",model);
	}
}
