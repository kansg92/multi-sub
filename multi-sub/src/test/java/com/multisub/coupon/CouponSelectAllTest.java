package com.multisub.coupon;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.CouponBiz;
import com.multisub.vo.CouponVO;

@SpringBootTest
class CouponSelectAllTest {
	
	@Autowired
	CouponBiz cobiz;
	
	@Test
	void contextLoads() {
		List<CouponVO> list = null;
		
		try {
			list = cobiz.get();
			for (CouponVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
