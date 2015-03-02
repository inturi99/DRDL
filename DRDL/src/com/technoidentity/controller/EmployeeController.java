package com.technoidentity.controller;

import java.io.IOException;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.technoidentity.dto.EmployeeDto;
import com.technoidentity.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
	public String loadEmployee(Map<String, Object> map) {
		map.put("employeeDto", new EmployeeDto());
		return "employee";
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String addEmployee(
			@ModelAttribute("employeeDto") @Valid EmployeeDto employeeDto,
			BindingResult result, @RequestParam("photo") MultipartFile[] photo) {
		try {
			for (MultipartFile aFile : photo) {
				String s = new sun.misc.BASE64Encoder().encode(aFile.getBytes());

				employeeDto.setPhoto(s);
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		}
		try {
			employeeService.addEmployee(employeeDto);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/list";
	}

	@RequestMapping("/list")
	public String listEmployee(Map<String, Object> map) {
		// map.put("employee", new Employee());
		map.put("employeeList", employeeService.listEmployees());
		return "employeeslist";
	}
	@RequestMapping("/contrList")
	public String listContractEmployee(Map<String, Object> map) {
		// map.put("employee", new Employee());
		map.put("contrList", employeeService.listContractEmployee());
		return "contractemployeelist";
	}

	@RequestMapping("/delete/{employeeId}")
	public String deleteEmployee(@PathVariable("employeeId") Integer employeeId) {
		employeeService.removeEmloyee(employeeId);
		return "redirect:/list";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String getEmployeeId(
			@RequestParam(value = "id", required = true) String id, Model model) {
		model.addAttribute("employeeDto", employeeService.getEmployeeId(id));
		return "editemployee";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String updateEmployee(@ModelAttribute("employeeDto") EmployeeDto employeeDto,
			@RequestParam(value = "id", required = true) String id, Model model) {
		employeeDto.setId(id);
		employeeService.updateEmpolyee(employeeDto);
		model.addAttribute("id", id);
		return "redirect:/list";
	}
	@RequestMapping(value="/load",method=RequestMethod.GET)
	public ModelAndView load(){
		return new ModelAndView("/table");
	}
	@RequestMapping(value="/load/{name}",method=RequestMethod.GET)
	public ModelAndView loadByName(@PathVariable("name") String name,ModelMap model){
	model.put("employees", employeeService.findByFirstName(name));
	return new ModelAndView("/search",model);
	}

}
