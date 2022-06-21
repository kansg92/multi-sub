package com.multisub.topping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.ToppingBiz;
import com.multisub.vo.ToppingVO;

@SpringBootTest
class InsertTest {

	@Autowired
	ToppingBiz biz;
	
	@Test
	void contextLoads() {
		ToppingVO obj = new ToppingVO(0,"양상추", 1,"양상추",400);
		
		try {
			biz.register(obj);
			System.out.println(biz.get(2));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
