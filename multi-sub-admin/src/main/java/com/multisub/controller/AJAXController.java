package com.multisub.controller;

import java.util.List;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multisub.biz.MainBiz;
import com.multisub.biz.UsersBiz;
import com.multisub.vo.ChartVO;
import com.multisub.vo.UsersVO;


@RestController
public class AJAXController {
	
	@Autowired
	UsersBiz biz;
	
	@Autowired
	MainBiz mbiz;

	@RequestMapping("checkid")
	public String checkid(String id) {		
		String result = "";
		UsersVO uvo = null;
		
		if(id.equals("") || id == null) { 
			return "2"; 
		}		
		if(!Pattern.matches("^[0-9a-zA-Z]*$",id)) { 
			return "3"; 
		}		
		try {
			uvo = biz.get(id);
			if(uvo == null) {
				result = "0";
			}else{
				result = "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return result;
	}//checkid
	
	
	@RequestMapping("display_sales")
	public Object display_sales(Model m) {
		
		JSONObject jo = new JSONObject();		
		JSONArray salesarr = new JSONArray(); 
		JSONArray usertypearr100 = new JSONArray();
		JSONArray usertypearr200 = new JSONArray();
		JSONArray sdatearr = new JSONArray();		
		
		List<ChartVO> list = null;
		
		try {
			list= mbiz.getorderchartdata();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		for (ChartVO c : list) {						
			usertypearr100.add(c.getUserType100());
			usertypearr200.add(c.getUserType200());
			salesarr.add(c.getSales());
			sdatearr.add(c.getSdate());				
		}//for	
		
		jo.put("usertypearr100", usertypearr100);
		jo.put("usertypearr200", usertypearr200);
		jo.put("sdatearr", sdatearr);
		return jo;
		
	}
	
	
	@RequestMapping("display_pay")
	public Object display_pay(Model m) {
		
		JSONObject jo = new JSONObject();		
		JSONArray picardarr = new JSONArray(); 
		JSONArray picasharr = new JSONArray();
		JSONArray pipayarr = new JSONArray();
		JSONArray sdatearr = new JSONArray();	
			
		List<ChartVO> list = null;
		
		try {
			list= mbiz.getpaychartdata();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		for (ChartVO c : list) {				
			picardarr.add(c.getPicard());
			picasharr.add(c.getPicash());
			pipayarr.add(c.getPipay());			
			sdatearr.add(c.getSdate());			
		}//for	
 
		jo.put("picardarr", picardarr);
		jo.put("picasharr", picasharr);
		jo.put("pipayarr", pipayarr);
		//jo.put("salesarr", salesarr);		
		jo.put("sdatearr", sdatearr);		

		return jo;
	}
	
	
	@RequestMapping("display_total")
	public Object display_total(Model m) {
		
		JSONObject jo = new JSONObject();		
		JSONArray ordercntarr = new JSONArray();
		JSONArray sdatearr = new JSONArray();	
		JSONArray salesarr = new JSONArray(); 
				
		List<ChartVO> list = null;
		
		try {
			list= mbiz.gettotalchartdata();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		for (ChartVO c : list) {				
			ordercntarr.add(c.getOrdercnt());		
			salesarr.add(c.getSales());
			sdatearr.add(c.getSdate());			
		}//for	
 
		jo.put("ordercntarr", ordercntarr);
		jo.put("salesarr", salesarr);		
		jo.put("sdatearr", sdatearr);		
			
		return jo;	
	}
	
	
	
	@RequestMapping("display_cate")
	public Object display_cate(Model m) {
		JSONObject jo = new JSONObject();		
		JSONArray catenamearr = new JSONArray();	
		JSONArray salesarr = new JSONArray(); 				
		List<ChartVO> list = null;		
		try {
			list= mbiz.getcatechartdata();
		} catch (Exception e) {			
			e.printStackTrace();
		}		
		for (ChartVO c : list) {				
			catenamearr.add(c.getCatename());		
			salesarr.add(c.getSales());		
		}//for	
		jo.put("catenamearr", catenamearr);
		jo.put("salesarr", salesarr);			
		System.out.println("chart: " + jo.toString());			
		return jo; 
		
/*		JSONObject jo = new JSONObject();	
		JSONArray catedata = new JSONArray(); 
		List<String> list = null;
		try {
			list= mbiz.getcatechartdata();
		} catch (Exception e) {			
			e.printStackTrace();
		}		
		for (String str : list) {				
			catedata.add(str);			
		}
		jo.put("catedata", catedata);		
		System.out.println("chart: " + catedata.toString());			
		
		return jo; */
		
		
	}
	
	
	
	
			
}
	
	

