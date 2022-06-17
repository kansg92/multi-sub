package com.multisub.coupondetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.CouponDetailBiz;
import com.multisub.vo.CouponDetailVO;

@SpringBootTest
class CouponDetailInsertTests {

	@Autowired
	CouponDetailBiz cdbiz;
	
	@Test
	void contextLoads() {
		CouponDetailVO cd = new CouponDetailVO(7, "사용", "2022-06-15", "id01", 1,1);
		
		try {
			cdbiz.register(cd);
			System.out.println("Register OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
