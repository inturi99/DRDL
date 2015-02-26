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

import com.technoidentity.dto.MonthlyAttendanceDto;
import com.technoidentity.service.EmployeeService;
import com.technoidentity.service.MonthlyAttendanceService;

@Controller
public class MonthlyAttendanceController {
	@Autowired
	public MonthlyAttendanceService monthlyAttendanceService;
    @Autowired
    public EmployeeService employeeService;
	@RequestMapping(value = "/addAttendance", method = RequestMethod.GET)
	public String loadAttence(Map<String, Object> map,HttpServletRequest request) {
		map.put("list", employeeService.listEmployees());	
		map.put("monthlyAttendanceDto", new MonthlyAttendanceDto());
		return "attendance";
	}
	
	@RequestMapping(value="/addAttendance",method=RequestMethod.POST)
	public String addAttendance(@ModelAttribute("monthlyAttendanceDto") @Valid MonthlyAttendanceDto monthlyAttendanceDto,BindingResult result){
		monthlyAttendanceService.addAttendence(monthlyAttendanceDto);
		return "redirect:/list";
	}


}
