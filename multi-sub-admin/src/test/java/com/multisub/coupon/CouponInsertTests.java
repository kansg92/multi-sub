package com.multisub.coupon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.CouponBiz;
import com.multisub.vo.CouponVO;

@SpringBootTest
class CouponInsertTests {

	@Autowired
	CouponBiz cobiz;
	
	@Test
	void contextLoads() {
		CouponVO coupon = new CouponVO(8,"창립일 쿠폰", 0.4, null,"2022-08-09", true);
		
		try {
			cobiz.register(coupon);
			System.out.println("Register OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
