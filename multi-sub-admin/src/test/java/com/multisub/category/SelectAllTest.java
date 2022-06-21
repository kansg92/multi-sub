package com.multisub.category;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.CategoryBiz;
import com.multisub.vo.CategoryVO;

@SpringBootTest
class SelectAllTest {

	@Autowired
	CategoryBiz biz;
	
	@Test
	void contextLoads() {
		List<CategoryVO> list = null;
		
		try {
			list = biz.get();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (CategoryVO obj : list) {
			System.out.println(obj);
		}
	}

}
