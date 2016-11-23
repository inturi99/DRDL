package com.technoidentity.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
import org.springframework.web.servlet.ModelAndView;

import com.technoidentity.dto.PdSanctionDto;
import com.technoidentity.service.PdSanctionDownloadServiceImpl;
import com.technoidentity.service.PdSanctionService;
import com.technoidentity.service.SoClearenceService;

@Controller
public class PdSanctionController {
	@Autowired
	private PdSanctionService pdSanctionService;
	@Autowired
	private SoClearenceService soClearenceService;
    @Autowired
    private PdSanctionDownloadServiceImpl pdSanctionDownloadServiceImpl;
	@RequestMapping(value = "/addPdSanction", method = RequestMethod.GET)
	public String loadSoCleance(Map<String, Object> map) {
		map.put("pdSanctionDto", new PdSanctionDto());
		map.put("sooList",soClearenceService.listSoClearenceOfficer());
		
		return "pdsanction";
	}

	@RequestMapping(value = "/addPdSanction", method = RequestMethod.POST)
	public String addPdSanction(
			@ModelAttribute("pdSanctionDto") @Valid PdSanctionDto pdSanctionDto,
			BindingResult result) {
		pdSanctionService.addPdSanction(pdSanctionDto);
		return "redirect:/pdList";
	}
	@RequestMapping(value = "/editPdSanction", method = RequestMethod.GET)
	public String geteditPdSanctionId(
			@RequestParam(value = "id", required = true) String id, Model model) {
		model.addAttribute("pdSanctionDto",pdSanctionService.getId(id));
		model.addAttribute("sooList", soClearenceService.listSoClearenceOfficer());
		
		return "editpdsanction";
	}
	
	@RequestMapping(value = "/editPdSanction", method = RequestMethod.POST)
	public String updateeditPdSanction(@ModelAttribute("pdSanctionDto") PdSanctionDto pdSanctionDto,
			@RequestParam(value = "id", required = true) String id, Model model) {
		pdSanctionDto.setId(id);
		pdSanctionService.editPdSanction(pdSanctionDto);;
		model.addAttribute("id", id);
		model.addAttribute("sooList", soClearenceService.listSoClearenceOfficer());
		
		return "redirect:/pdList";
	}
	@RequestMapping("/pdList")
	public String listPdSanction(Map<String, Object> map) {
		map.put("pdList", pdSanctionService.listPdSanction());
		return "pdsanctionlist";
	}
	
	@RequestMapping(value="/pdsanction",method=RequestMethod.GET)
	public ModelAndView loadPdsanctionPropCode(Map<String, Object> map,HttpServletRequest request){
		map.put("pdlist", pdSanctionService.listPdSanction());
		map.put("pdSanctionDto", new PdSanctionDto());
		return new ModelAndView("/pdsanctionreportlist");
	}
	
	
	@RequestMapping(value="/pdsanction/{propcode}",method=RequestMethod.GET)
	public ModelAndView loadPdsanctionPropCode(@PathVariable("propcode") String propcode,ModelMap model){
	model.put("pdsanction", pdSanctionService.findByPropCode(propcode));
	model.put("pdlist", pdSanctionService.listPdSanction());
	return new ModelAndView("/fetchpdsanction",model);
	}
	@RequestMapping(value = "/report/pdsanction/{id}", method = RequestMethod.GET)
	public String downloadpdsanction(
			@PathVariable("id") String id,HttpServletResponse response, Model model){
		model.addAttribute("id",pdSanctionDownloadServiceImpl.download(response, id));
	return "home";	
	}

}
