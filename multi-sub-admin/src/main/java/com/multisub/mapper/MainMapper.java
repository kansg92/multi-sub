package com.multisub.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multisub.vo.CouponVO;
import com.multisub.vo.ProductVO;
import com.multisub.vo.UsersVO;

@Repository
@Mapper
public interface MainMapper { 
	
	public List<CouponVO> searchcoupon(String str) throws Exception;	
	public List<UsersVO> searchcustomer(String str) throws Exception;
	public List<UsersVO> searchemployee(String str) throws Exception;	
	public List<ProductVO> searchproduct(String str) throws Exception;

	public int getcouponcnt() throws Exception;
	public int getcustomercnt() throws Exception;
	public int getemployeecnt() throws Exception;
	public int getnutritioncnt() throws Exception;
	public int getproductcnt() throws Exception;
	public int gettoppingcnt() throws Exception;
	
}
