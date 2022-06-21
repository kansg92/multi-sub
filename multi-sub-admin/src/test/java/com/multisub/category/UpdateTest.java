package com.multisub.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.CategoryBiz;
import com.multisub.vo.CategoryVO;

@SpringBootTest
class UpdateTest {

	@Autowired
	CategoryBiz biz;
	
	@Test
	void contextLoads() {
		CategoryVO obj = new CategoryVO(10, "test update", null);
		
		try {
			biz.modify(obj);
			
			System.out.println(biz.get(10));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
