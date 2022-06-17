package com.multisub.topping;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.ToppingBiz;
import com.multisub.vo.ToppingVO;

@SpringBootTest
class SelectAllTest {

	@Autowired
	ToppingBiz biz;
	
	@Test
	void contextLoads() {
		List<ToppingVO> list = null;
		
		try {
			list = biz.get();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (ToppingVO obj : list) {
			System.out.println(obj);
		}
	}

}
