package com.project.kingthejoy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = "/selectResistForm.do")
	public String selectResistForm() { 
		 
		logger.info("Resist Form Open");
		
		return "selectResist";
	}
	
	@RequestMapping(value= "/resistForm.do")
	public String resistForm(int mem_role, Model model) {
		
		logger.info("Resist Form Open : " + mem_role + "번");
		
		model.addAttribute("mem_role", mem_role);
		
		return "resist"; 
	}
	

}