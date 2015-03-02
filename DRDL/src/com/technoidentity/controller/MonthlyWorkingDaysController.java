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

import com.technoidentity.dto.MonthlyWorkingDaysDto;
import com.technoidentity.service.MonthlyWorkingDaysService;

	@Controller
	public class MonthlyWorkingDaysController {
		@Autowired
		private MonthlyWorkingDaysService monthlyWorkingdaysService;
	   @RequestMapping(value="/addMonthlyworkigdays", method = RequestMethod.GET)
		public String loadWorkingDays(Map<String, Object> map,HttpServletRequest request) {
			map.put("monthlyWorkingDaysDto", new MonthlyWorkingDaysDto());
			return "workingdays";
		}
	   @RequestMapping(value="/addMonthlyworkigdays",method=RequestMethod.POST)
		public String addProjectManager(@ModelAttribute("monthlyWorkingDaysDto") @Valid MonthlyWorkingDaysDto monthlyWorkingDaysDto,BindingResult result){
			monthlyWorkingdaysService.saveMonthlyworkingdays(monthlyWorkingDaysDto);
		   return "redirect:/list";
		}
	}


