package com.multisub.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.OrdersBiz;
import com.multisub.vo.OrdersVO;

@SpringBootTest
class InsertTest {

	@Autowired
	OrdersBiz biz;
	
	@Test
	void contextLoads() {
		OrdersVO obj = new OrdersVO(0, 10000, "카드",null, "결제완료", null,"id01");
		
		try {
			biz.register(obj);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
