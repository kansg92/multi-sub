package com.multisub.coupon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.CouponBiz;

@SpringBootTest
class CouponDeleteTest {
	
	@Autowired
	CouponBiz cobiz;
	
	@Test
	void contextLoads() {
		try {
			cobiz.remove(3);
			System.out.println("Delete OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
