package com.multisub.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
public class MainController {

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
	
	@RequestMapping("/")
	public String main(String mapping, Model m,HttpSession session) {
		System.out.println("main--------------Start"+mapping);
		// 토핑셀렉츠 정보 가져오기.
		List<ProductVO> cartList = new ArrayList<>();
		List<Integer> toppingSum = new ArrayList<>();
		Integer num = 0;
		if(session.getAttribute("count") != null) {
			
			num = (int) session.getAttribute("count");
			System.out.println("num:: "+num);
			
			for (int i = 0; i < num; i++) {	
				HashMap<String, Object> hashMap = 
						(HashMap<String, Object>) session.getAttribute("topping"+Integer.valueOf(i+1));
				
				if(hashMap != null) {
					int bread = (int) hashMap.get("bread");
					int toast = (int) hashMap.get("toast");
					int cm = (int) hashMap.get("cm");
					int cheese = (int) hashMap.get("cheese");
					int prod = (int) hashMap.get("prod");
					List<Integer> vegetable = (List<Integer>) hashMap.get("vegetable");
					List<Integer> sauce = (List<Integer>) hashMap.get("sauce");
					List<Integer> others = (List<Integer>) hashMap.get("others");
					
					System.out.println("toppingList:: "+session.getAttribute("topping"+Integer.valueOf(i+1)));
					// 토핑 추가 가격합산 가져오기
					ToppingVO topping = null;
					ToppingVO breadLength = null;
					try {
						breadLength = topbiz.get(cm);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					int topSumPrice = breadLength.getPrice();
					for (int top : others) {
						try {
							topping = topbiz.get(top);
							topSumPrice += topping.getPrice();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					
					// 상품 정보 가져오기.
					ProductVO product = null;
					try {
						product = pbiz.get(prod);
						product.setSessionNum(i+1);
						cartList.add(product);
						toppingSum.add(topSumPrice);
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("toppingSum:: "+toppingSum);
					System.out.println("cartList:: "+cartList);
				}
			}
		}
		session.setAttribute("cartList",cartList);
		session.setAttribute("toppingPrice",toppingSum);
		session.setAttribute("count",num);
		// 토핑셀렉츠 정보 가져오기. -end
		
		if("deleteSessionItem".equals(mapping)) {
			m.addAttribute("center","orderproductprice");
			
			System.out.println("main-----orderproductprice---------End");
			
			return "/main";
		}else {
			List<ProductVO> list = null;
			try {
				list = pbiz.selectMenu(140);
				m.addAttribute("prodlist",list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			m.addAttribute("center","promotion");

			System.out.println("main--------------End");
			
			return "/main";
		}
		
	}
	
	@RequestMapping("/promotion")
	public String promotion(Model m) {
		
		
		List<ProductVO> list = null;
		try {
			list = pbiz.selectMenu(140);
			m.addAttribute("prodlist",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		m.addAttribute("center","promotion");
		
		return "/main";
	}
	
	@RequestMapping("/sandwitch")
	public String sandwitch(Model m, HttpSession session) {
		
		// session.invalidate();
		List<ProductVO> list = null;
		try {
			list = pbiz.selectMenu(110);
			m.addAttribute("prodlist",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		m.addAttribute("center","sandwitch");
		
		return "/main";
	}
	
	@RequestMapping("/salad")
	public String salad(Model m) {
		List<ProductVO> list = null;
		try {
			list = pbiz.selectMenu(120);
			m.addAttribute("prodlist",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		m.addAttribute("center","salad");
		
		return "/main";
	}
	
	@RequestMapping("/lab")
	public String lab(Model m) {
		List<ProductVO> list = null;
		try {
			list = pbiz.selectMenu(130);
			m.addAttribute("prodlist",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addAttribute("center","lab");
		
		return "/main";
	}
	
	@RequestMapping("/side")
	public String side(Model m,HttpSession session) {
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		try {
			list.addAll(pbiz.selectMenu(210));
			list.addAll(pbiz.selectMenu(220));
			list.addAll(pbiz.selectMenu(230));
			list.addAll(pbiz.selectMenu(240));
			
			m.addAttribute("prodlist",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addAttribute("center","side");
		return "/main";
	}
		

	@RequestMapping("deleteSession")
	public String deleteSession(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}

	
	
}