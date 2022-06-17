package com.multisub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String main(Model m) {
		m.addAttribute("center","center");
		
		return "/main";
	}
	
	@RequestMapping("/promotion")
	public String promotion(Model m) {
		m.addAttribute("center","promotion");
		
		return "/main";
	}
	
	@RequestMapping("/sandwitch")
	public String sandwitch(Model m) {
		m.addAttribute("center","sandwitch");
		
		return "/main";
	}
	
	@RequestMapping("/salad")
	public String salad(Model m) {
		m.addAttribute("center","salad");
		
		return "/main";
	}
	
	@RequestMapping("/lab")
	public String lab(Model m) {
		m.addAttribute("center","lab");
		
		return "/main";
	}
	
	@RequestMapping("/side")
	public String side(Model m) {
		m.addAttribute("center","side");
		
		return "/main";
	}
	
}
