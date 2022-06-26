package com.multisub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multisub.biz.CategoryBiz;
import com.multisub.biz.ToppingBiz;
import com.multisub.frame.Util;
import com.multisub.vo.CategoryVO;
import com.multisub.vo.ToppingVO;


@Controller
@RequestMapping("/topping")
public class ToppingController {
	
	@Value("${admindir}")
	String admindir;
	
	@Value("${userdir}")
	String userdir;
	
	@Autowired
	ToppingBiz biz;
	
	@Autowired
	CategoryBiz catebiz;
	
	@RequestMapping("/register")
	public String register(Model m) {
		List<CategoryVO> list = null;
		try {
			list = catebiz.get();
			m.addAttribute("clist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "topping/register");
		return "/main";
	}
	
	@RequestMapping("/registerimpl")
	public String registerimpl(Model m, ToppingVO t) {
		// name, price, cid, mf(->imgname)
		String imgname = t.getMf().getOriginalFilename();
		t.setImgname(imgname);
		
		try {
			biz.register(t);
			Util.saveFile(t.getMf(),admindir,userdir); 
			// 파일을 서버에 저장하는 모듈
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:select";
	}
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<ToppingVO> list = null;
		try {
			list = biz.get();
			m.addAttribute("tlist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "topping/select");
		return "/main";
	}
	
	@RequestMapping("/detail")
	public String detail(Model m, int id) {
		ToppingVO obj = null;
		List<CategoryVO> list = null;
		try {
			list = catebiz.get();
			m.addAttribute("clist", list);
			obj = biz.get(id);
			m.addAttribute("t", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "topping/detail");
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
	public String updateimpl(Model m, ToppingVO t) {
		
		String iname = t.getMf().getOriginalFilename();
		if(!(iname.equals(""))) {
			t.setImgname(iname);
			Util.saveFile(t.getMf(),admindir,userdir);
		}
		System.out.println(t);
		
		try {
			biz.modify(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:select";
	}
}
