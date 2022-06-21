package com.multisub.coupondetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.CouponDetailBiz;

@SpringBootTest
class CouponDetailDeleteTest {
	
	@Autowired
	CouponDetailBiz cdbiz;
	
	@Test
	void contextLoads() {
		try {
			cdbiz.remove(7);
			System.out.println("Delete OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
