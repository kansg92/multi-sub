package com.multisub.toppingDetail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.ToppingDetailBiz;
import com.multisub.vo.ToppingDetailVO;

@SpringBootTest
class SelectAllTest {

	@Autowired
	ToppingDetailBiz biz;
	
	@Test
	void contextLoads() {
		List<ToppingDetailVO> list = null;
		
		try {
			list = biz.get();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (ToppingDetailVO obj : list) {
			System.out.println(obj);
		}
	}

}
