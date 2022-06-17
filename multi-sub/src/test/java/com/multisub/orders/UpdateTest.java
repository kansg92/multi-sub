package com.multisub.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.OrdersBiz;
import com.multisub.vo.OrdersVO;

@SpringBootTest
class UpdateTest {

	@Autowired
	OrdersBiz biz;
	
	@Test
	void contextLoads() {
		OrdersVO obj = new OrdersVO(1, 5000, "카카오페이", null, "취소", null, "id01");
		
		try {
			biz.modify(obj);
			System.out.println(biz.get(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
