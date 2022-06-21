package com.multisub.nutrition;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.NutritionBiz;
import com.multisub.vo.NutritionVO;

@SpringBootTest
class NutritionDeleteTests {

	@Autowired
	NutritionBiz biz;
	
	@Test
	void contextLoads() { 
		
		try {
			biz.remove(5);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
