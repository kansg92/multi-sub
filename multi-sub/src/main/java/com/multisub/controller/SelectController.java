package com.multisub.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.multisub.biz.OrdersBiz;
import com.multisub.biz.OrdersDetailBiz;
import com.multisub.biz.ProductBiz;
import com.multisub.biz.ToppingBiz;
import com.multisub.biz.ToppingDetailBiz;
import com.multisub.vo.OrdersDetailVO;
import com.multisub.vo.ProductVO;
import com.multisub.vo.ToppingDetailVO;
import com.multisub.vo.ToppingVO;

@Controller
public class SelectController {
	
	@Autowired
	ProductBiz pbiz;
	
	@Autowired
	ToppingBiz topbiz;
	
	@Autowired
	OrdersBiz orderbiz;
	
	@Autowired
	ToppingDetailBiz topdbiz;
	
	@Autowired
	OrdersDetailBiz odbiz;
	
	@Autowired
	OrdersBiz obiz;
	
	@RequestMapping("sandwitchDetail")
	public String selectTopping(Model m, int id) {
		List<ToppingVO> bread = null;
		List<ToppingVO> vegetable = null;
		List<ToppingVO> sauce = null;
		List<ToppingVO> others = null;
		List<ToppingVO> cheese = null;
		List<ToppingVO> option = null;
		List<ToppingVO> toast = null;
		


		ProductVO p = null;
		m.addAttribute("empty","empty");
		try {

			bread = topbiz.selectMenu(310);
			option = topbiz.selectMenu(320);
			toast = topbiz.selectMenu(325);
			cheese = topbiz.selectMenu(330);
			vegetable = topbiz.selectMenu(340);
			sauce = topbiz.selectMenu(360);
			others = topbiz.selectMenu(370);
			p= pbiz.get(id);
			m.addAttribute("prod",p);
			m.addAttribute("bread",bread);
			m.addAttribute("vegetable",vegetable);
			m.addAttribute("sauce",sauce);
			m.addAttribute("others",others);
			m.addAttribute("cheese",cheese);
			m.addAttribute("option",option);
			m.addAttribute("toast",toast);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		m.addAttribute("center","sandwitchDetail");
		return "/main";
	}
	
	
	@RequestMapping("saladDetail")
	public String saladDetail(Model m, int id) {
		List<ToppingVO> bread = null;
		List<ToppingVO> vegetable = null;
		List<ToppingVO> sauce = null;
		List<ToppingVO> others = null;
		List<ToppingVO> cheese = null;
		List<ToppingVO> option = null;
		List<ToppingVO> toast = null;
		


		ProductVO p = null;
		m.addAttribute("empty","empty");
		try {


			cheese = topbiz.selectMenu(330);
			vegetable = topbiz.selectMenu(340);
			sauce = topbiz.selectMenu(360);
			others = topbiz.selectMenu(370);
			p= pbiz.get(id);
			m.addAttribute("prod",p);
			m.addAttribute("vegetable",vegetable);
			m.addAttribute("sauce",sauce);
			m.addAttribute("others",others);
			m.addAttribute("cheese",cheese);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		m.addAttribute("center","saladDetail");
		return "/main";
	}
	
	@RequestMapping("slabDetail")
	public String slabDetail(Model m, int id) {
		List<ToppingVO> bread = null;
		List<ToppingVO> vegetable = null;
		List<ToppingVO> sauce = null;
		List<ToppingVO> others = null;
		List<ToppingVO> cheese = null;
		List<ToppingVO> option = null;
		List<ToppingVO> toast = null;
		
		ProductVO p = null;
		m.addAttribute("empty","empty");
		
		try {
			cheese = topbiz.selectMenu(330);
			vegetable = topbiz.selectMenu(340);
			sauce = topbiz.selectMenu(360);
			others = topbiz.selectMenu(370);
			p= pbiz.get(id);
			m.addAttribute("prod",p);
			m.addAttribute("vegetable",vegetable);
			m.addAttribute("sauce",sauce);
			m.addAttribute("others",others);
			m.addAttribute("cheese",cheese);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		m.addAttribute("center","slabDetail");
		return "/main";
	}
	
	
	@RequestMapping("toppingaddimpl")
	public String toppingaddimpl(Model m, Integer bread, 
			Integer toast, Integer cm ,Integer cheese,
			@RequestParam List<Integer> vegetable,
			@RequestParam List<Integer> sauce,
			@RequestParam List<Integer> others,
			int prod,
			HttpSession session) {
		
		ProductVO product = null;
		OrdersDetailVO oderd = null;
		ToppingDetailVO td = null;
		int num = 1;
	
		try {
			HashMap<String, Object> hashMap  = new HashMap(); 
			
			hashMap.put("bread", bread);
			hashMap.put("toast", toast);
			hashMap.put("cm", cm);
			hashMap.put("cheese", cheese);
			hashMap.put("vegetable", vegetable);
			hashMap.put("prod", prod);
			hashMap.put("sauce", sauce);
			hashMap.put("others", others);
					
			if(session.getAttribute("count") != null) {
				num = (int) session.getAttribute("count") + 1;
			}
			
			session.setAttribute("count", num);
			session.setAttribute("topping"+num, hashMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		m.addAttribute("center","center");
		return "redirect:";
		
	}
	
}