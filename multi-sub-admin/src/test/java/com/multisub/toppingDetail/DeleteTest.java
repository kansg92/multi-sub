package com.multisub.toppingDetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.ToppingDetailBiz;

@SpringBootTest
class DeleteTest {

	@Autowired
	ToppingDetailBiz biz;
	
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
