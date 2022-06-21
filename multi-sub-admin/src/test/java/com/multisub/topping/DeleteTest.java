package com.multisub.topping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.ToppingBiz;

@SpringBootTest
class DeleteTest {

	@Autowired
	ToppingBiz biz;
	
	@Test
	void contextLoads() {
		
		
		try {
			biz.remove(2);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
