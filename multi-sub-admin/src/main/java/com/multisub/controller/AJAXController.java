package com.multisub.controller;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multisub.biz.UsersBiz;
import com.multisub.vo.UsersVO;


@RestController
public class AJAXController {
	
	@Autowired
	UsersBiz biz;	

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
	
}
