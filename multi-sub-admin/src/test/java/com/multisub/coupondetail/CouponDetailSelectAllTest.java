package com.multisub.coupondetail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.CouponDetailBiz;
import com.multisub.vo.CouponDetailVO;

@SpringBootTest
class CouponDetailSelectAllTest {
	
	@Autowired
	CouponDetailBiz cdbiz;
	
	@Test
	void contextLoads() {
		List<CouponDetailVO> list = null;
		
		try {
			list = cdbiz.get();
			for (CouponDetailVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
