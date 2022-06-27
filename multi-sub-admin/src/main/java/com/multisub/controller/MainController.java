package com.multisub.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multisub.biz.CategoryBiz;
import com.multisub.biz.CouponBiz;
import com.multisub.biz.MainBiz;
import com.multisub.biz.UsersBiz;
import com.multisub.vo.CategoryVO;
import com.multisub.vo.ChartVO;
import com.multisub.vo.CouponVO;
import com.multisub.vo.ProductVO;
import com.multisub.vo.UsersVO;

@Controller
public class MainController {
	
	@Autowired
	UsersBiz ubiz ;
	
	@Autowired
	CouponBiz cbiz;
	
	@Autowired
	MainBiz mbiz;
	
	@Autowired
	CategoryBiz catebiz;	
	
	
	@RequestMapping("/")
	public String main(Model m) {
		m.addAttribute("login","login");
		m.addAttribute("center","center");

		int couponcnt = 0;
		int customercnt = 0;
		int employeecnt= 0;
		int nutritioncnt = 0;
		int productcnt = 0;
		int toppingcnt = 0;
		
		try {
			couponcnt = mbiz.getCouponCnt();
			customercnt = mbiz.getCustomerCnt();
			employeecnt = mbiz.getEmployeeCnt();
			nutritioncnt = mbiz.getNutritionCnt();
			productcnt = mbiz.getProductCnt();
			toppingcnt = mbiz.getToppingCnt();
			m.addAttribute("couponcnt", couponcnt);
			m.addAttribute("customercnt", customercnt);
			m.addAttribute("employeecnt", employeecnt);
			m.addAttribute("nutritioncnt", nutritioncnt);
			m.addAttribute("productcnt", productcnt);
			m.addAttribute("toppingcnt", toppingcnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "main";		
	}
	
	
	@RequestMapping("/logout")
	public String logout(Model m, HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		return "redirect:/";
	}	
	
	/*
	@RequestMapping("/login")
	public String login(Model m) {
		m.addAttribute("center","login");
		return "main";
	}	
	*/
	
	@RequestMapping("/loginimpl")
	public String loginimpl(Model m, String id, String pwd, HttpSession session) {
		
		UsersVO admin = null;
		try {
			admin = ubiz.get(id);
			if(admin == null) {
				throw new Exception();
			}			
			if(admin.getPwd().equals(pwd) && admin.getUserTypeId()==300) {
				session.setAttribute("loginadmin", admin);
				m.addAttribute("center","center");	
				return "main";
			}else if(admin.getPwd().equals(pwd) && admin.getUserTypeId()!=300){	
				m.addAttribute("loginfail","관리자 계정이 아닙니다.");
				m.addAttribute("login","login");		
				return "main";	
			}else{
				m.addAttribute("loginfail"," 아이디 또는 비밀번호를 잘못 입력했습니다. ");
				m.addAttribute("login","login");		
				return "main";							
			}		
		} catch (Exception e) {
			//e.printStackTrace();			
			m.addAttribute("loginfail"," 아이디 또는 비밀번호를 잘못 입력했습니다. ");
			m.addAttribute("login","login");		
			return "main";
		}
	}//loginimpl
	

	@RequestMapping("search") //고객, 직원, 쿠폰, 제품 검색
	public String search(Model m, String srchtext, String srchselect) {

		List<UsersVO> ulist = null;
			
		switch(srchselect){
			case "coupon" :
				List<CouponVO> clist = null;
				try {
					clist = mbiz.searchcoupon(srchtext);
					m.addAttribute("clist", clist);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
			case "customer" :
				try {
					ulist = mbiz.searchcustomer(srchtext);
					m.addAttribute("ulist", ulist);
					m.addAttribute("userTypeId", 200);
				} catch (Exception e) {
					e.printStackTrace();
				}				
				break;
								
			case "employee" :
				try {
					ulist = mbiz.searchemployee(srchtext);
					m.addAttribute("ulist", ulist);
					m.addAttribute("userTypeId", 300);
				} catch (Exception e) {
					e.printStackTrace();
				}				
				break;		
				
			case "product" :
				try {
					List<ProductVO> plist = null;
					plist = mbiz.searchproduct(srchtext);			
					
					List<CategoryVO> catelist = null;
					catelist = catebiz.get();
					
					m.addAttribute("plist", plist);	
					m.addAttribute("catelist", catelist);						
				} catch (Exception e) {
					e.printStackTrace();
				}				
				break;
		}//switch
		
		m.addAttribute("center", "search");
		return "main";
	}//search
	
	
	
	
}
