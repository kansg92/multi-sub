package com.multisub.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.CategoryBiz;
import com.multisub.vo.CategoryVO;

@SpringBootTest
class DeleteTest {

	@Autowired
	CategoryBiz biz;
	
	@Test
	void contextLoads() {
		
		
		try {
			biz.remove(10);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
