package com.multisub.nutrition;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.NutritionBiz;
import com.multisub.vo.NutritionVO;

@SpringBootTest
class NutritionSelectTests {

	@Autowired
	NutritionBiz biz;
	
	@Test
	void contextLoads() {
		NutritionVO n = new NutritionVO();
		try {
			n = biz.get(1);
			System.out.println(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}

}
