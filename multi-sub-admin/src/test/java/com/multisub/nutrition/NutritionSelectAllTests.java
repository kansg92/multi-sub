package com.multisub.nutrition;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.NutritionBiz;
import com.multisub.vo.CategoryVO;
import com.multisub.vo.NutritionVO;

@SpringBootTest
class NutritionSelectAllTests {

	@Autowired
	NutritionBiz biz;
	
	@Test
	void contextLoads() {
		List<NutritionVO> list = null;

		try {
			list = biz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		for (NutritionVO n : list) {
			System.out.println(n);
		}				
	}
}
