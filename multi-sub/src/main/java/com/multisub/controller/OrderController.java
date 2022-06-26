package com.multisub.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multisub.biz.OrdersBiz;
import com.multisub.biz.OrdersDetailBiz;
import com.multisub.biz.ProductBiz;
import com.multisub.biz.ToppingBiz;
import com.multisub.biz.ToppingDetailBiz;
import com.multisub.vo.ProductVO;

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
	public String orderproductprice(HttpSession session,Model m) {
	
		m.addAttribute("center","orderproductprice");
		
		return "/main";
	}	
	


	
	@RequestMapping("deleteSessionItem")
	public ModelAndView deleteSessionItem(int cnt,HttpSession session,Model m) {
		
		System.out.println("대박샷Gun!!! :: "+cnt);
		System.out.println(session.getAttribute("topping"+cnt));
		session.removeAttribute("topping"+cnt);
		System.out.println(session.getAttribute("topping"+cnt));
		
		m.addAttribute("center","orderproductprice");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/?mapping=deleteSessionItem");
		return mv;
	}
	
	
}
