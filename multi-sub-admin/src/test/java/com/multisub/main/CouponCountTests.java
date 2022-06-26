package com.multisub.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.MainBiz;

@SpringBootTest
class CouponCountTests {

	@Autowired
	MainBiz biz;
	
	@Test
	void contextLoads() {
		int count;
		try {
			count = biz.getCouponCnt();
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}


