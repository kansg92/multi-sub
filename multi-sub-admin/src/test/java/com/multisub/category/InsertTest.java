package com.multisub.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.CategoryBiz;
import com.multisub.vo.CategoryVO;

@SpringBootTest
class InsertTest {

	@Autowired
	CategoryBiz biz;
	
	@Test
	void contextLoads() {
		CategoryVO obj = new CategoryVO(10, "test", null);
		
		try {
			biz.register(obj);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
