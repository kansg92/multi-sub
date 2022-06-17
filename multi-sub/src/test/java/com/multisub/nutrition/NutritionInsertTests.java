package com.multisub.nutrition;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.NutritionBiz;
import com.multisub.vo.NutritionVO;

@SpringBootTest
class NutritionInsertTests {

	@Autowired
	NutritionBiz biz;
	
	@Test
	void contextLoads() { 
		
		NutritionVO n = new NutritionVO(1.1, 2.1, 3.1, 4.1, 5.1, 6.1);
		try {
			biz.register(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
