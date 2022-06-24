package com.multisub.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
public class OrderController {

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

	private List<ProductVO> list;
	
	
	@RequestMapping("/orderproductprice")
	public String orderproductprice(Model m) {
		
		List<ProductVO> list = null;
		m.addAttribute("cart", list);
		m.addAttribute("center","orderproductprice");
		
		return "/main";
	}	
	

	@RequestMapping("orderproductdelete")
	public String orderproductdelete(HttpSession session, String num) {
		
		session.removeAttribute("topping"+num);
		
		return "redirect:/";
	}
	
	@RequestMapping("/payment")
	public String payment(Model m) {
		
		m.addAttribute("empty","empty");
		m.addAttribute("center","payment");
		return "/main";
	}

	@RequestMapping("orders")
	public String orders(Model m, HttpSession session) {
		m.addAttribute("empty","empty");
		m.addAttribute("center","orders");
		return "main";
	}
	

	@RequestMapping("/mtchoose")
	public String mtchoose(Model m) {
		m.addAttribute("empty","empty");
		m.addAttribute("center","mtchoose");
		
		return "/main";
	
	}
	
	@RequestMapping("/complete")
	public String complete(Model m) {
		m.addAttribute("empty","empty");
		m.addAttribute("center","complete");
		return "/main";
	}
	
	
	
}
