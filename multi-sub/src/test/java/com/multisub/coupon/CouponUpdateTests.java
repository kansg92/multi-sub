package com.multisub.coupon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.CouponBiz;
import com.multisub.vo.CouponVO;

@SpringBootTest
class CouponUpdateTests {

	@Autowired
	CouponBiz cobiz;
	
	@Test
	void contextLoads() {
		CouponVO coupon = new CouponVO(4, "여름 쿠폰", 0.3, "2022-08-28", false);
		
		try {
			cobiz.modify(coupon);
			System.out.println("Update OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
