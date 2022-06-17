package com.multisub.coupondetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.CouponDetailBiz;
import com.multisub.vo.CouponDetailVO;

@SpringBootTest
class CouponDetailUpdateTests {

	@Autowired
	CouponDetailBiz cdbiz;
	
	@Test
	void contextLoads() {
		CouponDetailVO cd = new CouponDetailVO(7, "미사용", null, "id01", 1,1);
		
		try {
			cdbiz.modify(cd);
			System.out.println("Update OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
