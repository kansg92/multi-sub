package com.multisub.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.ProductBiz;

@SpringBootTest
class DeleteTest {

	@Autowired
	ProductBiz biz;
	
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
