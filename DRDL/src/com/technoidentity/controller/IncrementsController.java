package com.technoidentity.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.technoidentity.dto.IncrementsDto;
import com.technoidentity.service.EmployeeService;
import com.technoidentity.service.IncrementsService;

@Controller
public class IncrementsController {
@Autowired
private IncrementsService incrementsService;
@Autowired
private EmployeeService employeeService;
@RequestMapping(value = "/addIncrement", method = RequestMethod.GET)
public String loadIncrement(Map<String, Object> map,HttpServletRequest request) {
	map.put("list", employeeService.listEmployees());	
	map.put("incrementsDto", new IncrementsDto());
	return "increment";
}

@RequestMapping(value="/addIncrement",method=RequestMethod.POST)
public String addAttendance(@ModelAttribute("incrementsDto") @Valid IncrementsDto incrementsDto,BindingResult result){
	incrementsService.addIncrement(incrementsDto);
	return "redirect:/list";
}
}
