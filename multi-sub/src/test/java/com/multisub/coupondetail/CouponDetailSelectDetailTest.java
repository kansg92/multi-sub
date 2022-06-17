package com.multisub.coupondetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.CouponDetailBiz;
import com.multisub.vo.CouponDetailVO;

@SpringBootTest
class CouponDetailSelectDetailTest {
	
	@Autowired
	CouponDetailBiz cdbiz;
	
	@Test
	void contextLoads() {
		CouponDetailVO coupon = null;
		
		try {
			coupon = cdbiz.getsd(1);
			System.out.println(coupon);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
