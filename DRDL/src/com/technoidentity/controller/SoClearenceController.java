package com.technoidentity.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.technoidentity.dto.SoClearenceDto;
import com.technoidentity.service.JobContractService;
import com.technoidentity.service.SoClearenceService;

@Controller
public class SoClearenceController {
	@Autowired
	private SoClearenceService soClearenceService;
	@Autowired
	private JobContractService jobContractService;

	@RequestMapping(value = "/addSoClearence", method = RequestMethod.GET)
	public String loadSoCleance(Map<String, Object> map) {
		map.put("soClearenceDto", new SoClearenceDto());
		map.put("jcList",jobContractService.listJobContracts());
		
		return "soclearence";
	}

	@RequestMapping(value = "/addSoClearence", method = RequestMethod.POST)
	public String addSoClearence(
			@ModelAttribute("soClearenceDto") @Valid SoClearenceDto soClearenceDto,
			BindingResult result) {
		soClearenceService.addSoClearence(soClearenceDto);
		return "redirect:/soList";
	}
	@RequestMapping(value = "/editSoClearence", method = RequestMethod.GET)
	public String geteditSoClearenceId(
			@RequestParam(value = "id", required = true) String id, Model model) {
		model.addAttribute("soClearenceDto",soClearenceService.getId(id));
		model.addAttribute("jcList", jobContractService.listJobContracts());
		
		return "editsoclearence";
	}
	
	@RequestMapping(value = "/editSoClearence", method = RequestMethod.POST)
	public String updateeditSoClearence(@ModelAttribute("soClearenceDto") SoClearenceDto soClearenceDto,
			@RequestParam(value = "id", required = true) String id, Model model) {
		soClearenceDto.setId(id);
		soClearenceService.editSoClearence(soClearenceDto);;
		model.addAttribute("id", id);
		model.addAttribute("jcList", jobContractService.listJobContracts());
		
		return "redirect:/soList";
	}
	

	@RequestMapping("/soList")
	public String listSoClearence(Map<String, Object> map) {
		map.put("soList", soClearenceService.listSoClearence());
		return "soclearencelist";
	}

}
