package com.multisub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multisub.biz.NutritionBiz;
import com.multisub.vo.NutritionVO;


@Controller
@RequestMapping("/nutrition")
public class NutritionController {
	
	@Autowired
	NutritionBiz biz;
	
	@RequestMapping("/register")
	public String register(Model m) {
		m.addAttribute("center", "nutrition/register");
		return "/main";
	}
	
	@RequestMapping("/registerimpl")
	public String registerimpl(Model m, NutritionVO n) {
		
		try {
			biz.register(n);
			m.addAttribute("dnutrition", n);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "nutrition/detail");
		return "redirect:select";
	}
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<NutritionVO> list = null;
		try {
			list = biz.get();
			m.addAttribute("nlist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "nutrition/select");
		return "/main";
	}
	
	@RequestMapping("/detail")
	public String detail(Model m, int id) {
		NutritionVO obj = null;
		try {
			obj = biz.get(id);
			m.addAttribute("n", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "nutrition/detail");
		return "/main";
	}
	
	@RequestMapping("/delete")
	public String delete(int id) {
		try {
			biz.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:detail?id="+id;
		}
		return "redirect:select";
	}
	

	@RequestMapping("/updateimpl")
	public String updateimpl(Model m, NutritionVO n) {
		try {
			biz.modify(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:select";
	}
}
