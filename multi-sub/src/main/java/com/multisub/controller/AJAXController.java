package com.multisub.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multisub.biz.OrdersBiz;
import com.multisub.biz.OrdersDetailBiz;
import com.multisub.biz.ToppingBiz;
import com.multisub.biz.ToppingDetailBiz;
import com.multisub.biz.UsersBiz;
import com.multisub.vo.OrdersDetailVO;
import com.multisub.vo.OrdersVO;
import com.multisub.vo.ToppingDetailVO;
import com.multisub.vo.ToppingVO;

@RestController
public class AJAXController {
	
	@Autowired
	UsersBiz ubiz;
	
	@Autowired
	OrdersBiz obiz;
	
	@Autowired
	OrdersDetailBiz odbiz;
	
	@Autowired
	ToppingBiz tbiz;
	
	@Autowired
	ToppingDetailBiz tdbiz;
	
	@RequestMapping("/checkUser")
	public boolean checkUser(String userId) throws Exception {
		boolean result = false;
		
		try {
			int check = ubiz.checkUsers(userId);
			if(check > 0) {
				result = true;
			}
			System.out.println("check :: "+check);
			System.out.println("result :: "+result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
		
		return result;
	}
	
	@RequestMapping("ordersimpl")
	public String ordersimpl(Model m, HttpSession session, int sumprice, String payInfo, String payState, String usersId,
		String prodIdArr, String amountArr, String odPriceArr) throws Exception {
		System.out.println("ordersimpl---------Start");
		try {
			
			OrdersVO order = new OrdersVO();
			
			//order insert...	
			order.setSumprice(sumprice);
			order.setPayInfo(payInfo);
			order.setPayState(payState);
			order.setUsersId(usersId);			
			obiz.register(order);
			
        	//화면의 prodID,amount,odPrice 받아오기.
			ArrayList<String> prodIdList = new ArrayList<>();
			ArrayList<String> amountList = new ArrayList<>();
			ArrayList<String> odPriceList = new ArrayList<>();
	        JSONParser parser = new JSONParser();
	        prodIdList =  (JSONArray) parser.parse(prodIdArr);
	        amountList =  (JSONArray) parser.parse(amountArr);
	        odPriceList =  (JSONArray) parser.parse(odPriceArr);
	        int num = 1;
	        //orderDetail insert...
	        for(int i=0; i<prodIdList.size(); i++) {
	        	
				OrdersDetailVO ordersDetail = new OrdersDetailVO();

	        	ordersDetail.setOrdersId(order.getId());
	        	ordersDetail.setProdId(Integer.parseInt(prodIdList.get(i)));
	        	ordersDetail.setAmount(Integer.parseInt(amountList.get(i)));
	        	ordersDetail.setOdPrice(Integer.parseInt(odPriceList.get(i)));
	        	System.out.println("ordersDetail :: "+ordersDetail);
	        	odbiz.register(ordersDetail);
	        	
	            //토핑 디테일 정보 인서트...
	    		if(session.getAttribute("count") != null) {
	    			
    				HashMap<String, Object> hashMap = new HashMap<String, Object>();
    				hashMap = toppingCheck(session, hashMap,  num);
    				
    				System.out.println("hashMap  :: "+hashMap);
    				if(hashMap != null)  {
						int bread = (int) hashMap.get("bread");
						int toast = (int) hashMap.get("toast");
						int cm = (int) hashMap.get("cm");
						int cheese = (int) hashMap.get("cheese");
						List<Integer> vegetable = (List<Integer>) hashMap.get("vegetable");
						List<Integer> sauce = (List<Integer>) hashMap.get("sauce");
						List<Integer> others = (List<Integer>) hashMap.get("others");
						System.out.println("others  :: "+others);
						try {
							
								toppigInsert("nope", bread, ordersDetail.getId()); 
								toppigInsert("nope", toast, ordersDetail.getId()); 
								toppigInsert("nope", cheese, ordersDetail.getId()); 
								toppigInsert("get", cm, ordersDetail.getId()); 
								for(int othersID : others) { 
									toppigInsert("get", othersID, ordersDetail.getId()); 
								}
								for(int vegetableId : vegetable) { 
									toppigInsert("nope", vegetableId, ordersDetail.getId()); 
								} 
								for(int sauceId : sauce) { 
									toppigInsert("nope", sauceId, ordersDetail.getId()); 
								}
							 
	
						} catch (Exception e) {
							// TODO: handle exception
						}
    				}
    				
	    		}	        	
	        }
			
//			session.invalidate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		System.out.println("ordersimpl---------end");
		session.invalidate();
		return "plz";
	}
	
	
	public HashMap<String, Object> toppingCheck(HttpSession session, HashMap<String, Object> hashMap, int num) {

		num++;
		hashMap = (HashMap<String, Object>) session.getAttribute("topping"+Integer.valueOf(num));
		
		if(hashMap == null)  {
			if(Integer.parseInt(session.getAttribute("count").toString()) > num) {
				toppingCheck(session,hashMap,num);
			}
		}
		return hashMap;
	}
		
		
	//토핑 인서트...
	public void toppigInsert(String type, int toppingId, int ordersDId) {

		int tdPrice = 0;
		try {
			
			if("get".equals(type)) {
				tdPrice = tbiz.getPrice(toppingId);
			}
		
			ToppingDetailVO toppingDetail = 
					new ToppingDetailVO(tdPrice,toppingId,ordersDId);
			System.out.println("topping::"+toppingDetail);
			tdbiz.register(toppingDetail);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	
}