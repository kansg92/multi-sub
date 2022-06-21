package com.multisub.coupon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.CouponBiz;
import com.multisub.vo.CouponVO;

@SpringBootTest
class CouponSelectTest {
	
	@Autowired
	CouponBiz cobiz;
	
	@Test
	void contextLoads() {
		CouponVO coupon = null;
		
		try {
			coupon = cobiz.get(1);
			System.out.println(coupon);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
