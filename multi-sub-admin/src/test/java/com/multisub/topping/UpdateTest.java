package com.multisub.topping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.ToppingBiz;
import com.multisub.vo.ToppingVO;

@SpringBootTest
class UpdateTest {

	@Autowired
	ToppingBiz biz;
	
	@Test
	void contextLoads() {
		ToppingVO obj = new ToppingVO(1, "양파",0, "양파 사진",400);
		
		try {
			biz.modify(obj);
			
			System.out.println(biz.get(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
