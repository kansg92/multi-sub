package com.multisub.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.OrdersBiz;

@SpringBootTest
class DeleteTest {

	@Autowired
	OrdersBiz biz;
	
	@Test
	void contextLoads() {
		
		try {
			biz.remove(2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
