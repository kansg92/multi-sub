package com.multisub.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AJAXController {
	
	@RequestMapping("/test")
	public String test(String bread, 
			String toast, String cm ,String cheese,
			@RequestParam List<String> vegetable,
			@RequestParam List<String> sauce,
			int prod) {
		
		System.out.println("topID: " + bread + " cm: " + cm + 
				" toast: " + toast + " cheese: " +cheese);
		for (String str : vegetable) {
			System.out.println(str);
		}
		
		for (String str2 : sauce) {
			System.out.println(str2);
		}
		
		
		return "";
	}
}
