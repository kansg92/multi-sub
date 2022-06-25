package com.multisub.biz;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multisub.mapper.MainMapper;
import com.multisub.vo.CouponVO;
import com.multisub.vo.ProductVO;
import com.multisub.vo.UsersVO;


@Service
public class MainBiz {

	@Autowired
	MainMapper dao;
	
	public List<CouponVO> searchcoupon(String str) throws Exception {
		return dao.searchcoupon(str);	
	}
	
	public List<UsersVO> searchcustomer(String str) throws Exception {
		return dao.searchcustomer(str);	
	}
	
	public List<UsersVO> searchemployee(String str) throws Exception {
		return dao.searchemployee(str);	
	}

	public List<ProductVO> searchproduct(String str) throws Exception {
		return dao.searchproduct(str);	
	}
	
}
