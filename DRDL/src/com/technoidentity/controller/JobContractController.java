package com.technoidentity.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
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

import com.technoidentity.dto.JobContractDto;
import com.technoidentity.service.EmployeeService;
import com.technoidentity.service.JobContractService;
import com.technoidentity.service.ProjectManagerService;

@Controller
public class JobContractController {
@Autowired
private JobContractService jobContractService;
@Autowired
private EmployeeService employeeService;
@Autowired
private ProjectManagerService projectManagerService;
@RequestMapping(value = "/addJobContract", method = RequestMethod.GET)
public String loadJobContract(Map<String, Object> map,HttpServletRequest request) {
	map.put("list", employeeService.listEmployees());
	map.put("pmlist",projectManagerService.listProjectManagers());
	map.put("jobContractDto", new JobContractDto());
	return "jobcontract";
}

@RequestMapping(value="/addJobContract",method=RequestMethod.POST)
public String addJobContract(@ModelAttribute("jobContractDto") @Valid JobContractDto jobContractDto,BindingResult result){
	jobContractService.addJobContract(jobContractDto);
	return "redirect:/jcList";
}
@RequestMapping("/jcList")
public String listJobContracts(Map<String, Object> map) {
	// map.put("employee", new Employee());
	map.put("jcList", jobContractService.listJobContracts());
	return "jobcontractlist";
}
@RequestMapping("/deletejobcontract/{jobcontratId}")
public String deleteEmployee(@PathVariable("jobcontratId") Integer jobcontratId) {
	jobContractService.removeJobContractEmloyee(jobcontratId);
	return "redirect:/jcList";
}
@RequestMapping(value = "/editjobcontract", method = RequestMethod.GET)
public String getJobContractId(
		@RequestParam(value = "id", required = true) String id, Model model) {
	model.addAttribute("jobContractDto", jobContractService.getJobContractId(id));
	model.addAttribute("list", employeeService.listEmployees());
	model.addAttribute("pmlist",projectManagerService.listProjectManagers());
	return "editjobcontract";
}

@RequestMapping(value = "/editjobcontract", method = RequestMethod.POST)
public String upJobContract(@ModelAttribute("jobContractDto") JobContractDto jobContractDto,
		@RequestParam(value = "id", required = true) String id, Model model) {
	jobContractDto.setId(id);
	jobContractService.updateJobContract(jobContractDto);
	model.addAttribute("id",id);
	model.addAttribute("list", employeeService.listEmployees());
	model.addAttribute("pmlist",projectManagerService.listProjectManagers());
	return "redirect:/jcList";
}
}
