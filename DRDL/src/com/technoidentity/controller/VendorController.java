package com.technoidentity.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.technoidentity.dto.VendorDto;
import com.technoidentity.service.VendorService;

@Controller
public class VendorController {
	@Autowired
	private VendorService vendorService;
	@RequestMapping(value="/addVendor",method=RequestMethod.GET)
	 public String loadVendor(Map<String,Object> map){
			map.put("vendorDto", new VendorDto());
		return "vendor";
		  }
	@RequestMapping(value="/addVendor",method=RequestMethod.POST)
	public String addVendor(@ModelAttribute("vendorDto") VendorDto vendorDto,BindingResult result){
		vendorService.addVendor(vendorDto);
		return "redirect:/venList";
	}
	@RequestMapping("/venList")
	public String listVendor(Map<String, Object> map) {
		// map.put("employee", new Employee());
		map.put("venList", vendorService.listVendors());
		return "vendorlist";
	}
	@RequestMapping(value = "/editVendor", method = RequestMethod.GET)
	public String geteditVendorId(
			@RequestParam(value = "id", required = true) String id, Model model) {
		model.addAttribute("vendorDto", vendorService.getVendorId(id));
		return "editvendor";
	}

	@RequestMapping(value = "/editVendor", method = RequestMethod.POST)
	public String updateVendor(@ModelAttribute("vendorDto") VendorDto vendorDto,
			@RequestParam(value = "id", required = true) String id, Model model) {
		vendorDto.setId(id);
		vendorService.updateVendor(vendorDto);
		model.addAttribute("id", id);
		return "redirect:/venList";
	}
	@RequestMapping("/deleteVendor/{vendorId}")
	public String deleteVendor(@PathVariable("vendorId") Integer vendorId) {
		vendorService.removeVendor(vendorId);
		return "redirect:/venList";
	}
}
