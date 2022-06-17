package com.multisub.ordersdetail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.OrdersDetailBiz;
import com.multisub.vo.OrdersDetailVO;

@SpringBootTest
class SelectAllTest {

	@Autowired
	OrdersDetailBiz biz;
	
	@Test
	void contextLoads() {
		List<OrdersDetailVO> list = null;
		
		try {
			list = biz.get();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (OrdersDetailVO obj : list) {
			System.out.println(obj);
		}
	}

}
