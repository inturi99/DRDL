package com.technoidentity.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.technoidentity.dto.EmployeeDto;
import com.technoidentity.dto.MonthlyAttendanceDto;
import com.technoidentity.service.EmployeeService;
import com.technoidentity.service.MonthlyAttendanceService;

@Controller
public class MonthlyAttendanceController {
	@Autowired
	private MonthlyAttendanceService monthlyAttendanceService;
    @Autowired
    private EmployeeService employeeService;
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
	@RequestMapping(value="/fetch",method=RequestMethod.GET)
	public ModelAndView fetchByEmployeeId(Map<String, Object> map,HttpServletRequest request){
		map.put("list", employeeService.listEmployees());	
		map.put("monthlyAttendanceDto", new MonthlyAttendanceDto());
		return new ModelAndView("/fetchattedance");
	}
	
	@RequestMapping(value="/fetch/{employeeId}",method=RequestMethod.GET)
	public ModelAndView fetchByEmployeeId(@PathVariable("employeeId") String employeeId,ModelMap model){
	model.put("attendance", monthlyAttendanceService.getEmployeeByEmployeeId(employeeId));
	return new ModelAndView("/fetch",model);
	}

}
