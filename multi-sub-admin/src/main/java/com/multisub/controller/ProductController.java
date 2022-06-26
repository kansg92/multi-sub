package com.multisub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multisub.biz.CategoryBiz;
import com.multisub.biz.ProductBiz;
import com.multisub.frame.Util;
import com.multisub.vo.CategoryVO;
import com.multisub.vo.ProductVO;


@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Value("${admindir}")
	String admindir;
	
	@Value("${userdir}")
	String userdir;
	
	@Autowired
	ProductBiz biz;
	
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
		m.addAttribute("center", "product/register");
		return "/main";
	}
	
	@RequestMapping("/registerimpl")
	public String registerimpl(Model m, ProductVO p) {
		String imgname = p.getMf().getOriginalFilename();
		p.setImgname(imgname);
		
		try {
			biz.register(p);
			Util.saveFile(p.getMf(),admindir,userdir); 
			// 파일을 서버에 저장하는 모듈
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:select";
	}
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<ProductVO> list = null;
		try {
			list = biz.get();
			m.addAttribute("plist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "product/select");
		return "/main";
	}
	
	@RequestMapping("/detail")
	public String detail(Model m, int id) {
		ProductVO obj = null;
		List<CategoryVO> list = null;
		try {
			list = catebiz.get();
			m.addAttribute("clist", list);
			obj = biz.get(id);
			m.addAttribute("p", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "product/detail");
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
	public String updateimpl(Model m, ProductVO p) {
		
		String iname = p.getMf().getOriginalFilename();
		if(!(iname.equals(""))) {
			p.setImgname(iname);
			Util.saveFile(p.getMf(),admindir,userdir);
		}
		System.out.println(p);
		
		try {
			biz.modify(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:select";
	}
}
