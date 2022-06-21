package com.multisub.orders;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.OrdersBiz;
import com.multisub.vo.OrdersVO;

@SpringBootTest
class SelectAllTest {

	@Autowired
	OrdersBiz biz;
	
	@Test
	void contextLoads() {
		List<OrdersVO> list = null;
		
		try {
			list = biz.get();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (OrdersVO obj : list) {
			System.out.println(obj);
		}
	}

}
