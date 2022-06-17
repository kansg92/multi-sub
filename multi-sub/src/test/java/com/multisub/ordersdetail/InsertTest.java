package com.multisub.ordersdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.OrdersDetailBiz;
import com.multisub.vo.OrdersDetailVO;

@SpringBootTest
class InsertTest {

	@Autowired
	OrdersDetailBiz biz;
	
	@Test
	void contextLoads() {
		OrdersDetailVO obj = new OrdersDetailVO(0,5,50000,1,1);
		
		try {
			biz.register(obj);
			System.out.println(biz.get(2));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
