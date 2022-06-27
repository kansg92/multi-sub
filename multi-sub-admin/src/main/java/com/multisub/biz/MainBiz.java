package com.multisub.biz;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multisub.mapper.MainMapper;
import com.multisub.vo.ChartVO;
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
	
	public int getCouponCnt() throws Exception {
		return dao.getcouponcnt();
	}
	
	public int getCustomerCnt() throws Exception {
		return dao.getcustomercnt();
	}
	
	public int getEmployeeCnt() throws Exception {
		return dao.getemployeecnt();
	}
	
	public int getNutritionCnt() throws Exception {
		return dao.getnutritioncnt();
	}
	
	public int getProductCnt() throws Exception {
		return dao.getproductcnt();
	}
	
	public int getToppingCnt() throws Exception {
		return dao.gettoppingcnt();
	}
	
	public List<ChartVO> getorderchartdata() throws Exception {
		return dao.getorderchartdata();		
	}
	
	public List<ChartVO> getpaychartdata() throws Exception {
		return dao.getpaychartdata();		
	}	
	
	public List<ChartVO> gettotalchartdata() throws Exception {
		return dao.gettotalchartdata();		
	}
	
	 public List<ChartVO> getcatechartdata() throws Exception { 
		 return dao.getcatechartdata(); 
	}
	
}
