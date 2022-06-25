package com.multisub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multisub.biz.CouponBiz;
import com.multisub.vo.CouponVO;
import com.multisub.vo.UsersVO;

@Controller
@RequestMapping("/coupon")
public class CouponController {
	
	@Autowired
	CouponBiz biz;
	
	
	@RequestMapping("/add")
	public String add(Model m) {
		m.addAttribute("center", "coupon/add");
		return "main";
	}
	
	@RequestMapping("addimpl")
	public String addimpl(Model m, CouponVO cvo) {		
		System.out.println("add: " + cvo);
		CouponVO latest = null;
		try {
			biz.register(cvo);
			latest = biz.getlatest();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?id="+latest.getId();
	}
	
	@RequestMapping("/detail")
	public String detail(Model m, int id) {
		CouponVO cvo = null;		
		try {
			cvo = biz.get(id);
			System.out.println(cvo);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		m.addAttribute("cvo", cvo);
		m.addAttribute("center","coupon/detail");
		return "main";
	}	
	
	@RequestMapping("/list")
	public String select(Model m) {
		List<CouponVO> clist = null;
		try {
			clist = biz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("clist", clist);
		m.addAttribute("center","coupon/list");
		return "main";
	}
	
	
	@RequestMapping("/delete")
	public String delete(Model m, CouponVO cvo) {
		int id = cvo.getId();
		try {
			biz.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:list";
	}	
	
	@RequestMapping("update")
	public String update(Model m, CouponVO cvo) {
		try {
			biz.modify(cvo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?id="+cvo.getId();
	}
	
	
	
}
