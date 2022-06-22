package com.multisub.product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.ProductBiz;
import com.multisub.vo.ProductVO;

@SpringBootTest
class SelectMenuTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		List<ProductVO> list = null;
		
		try {
			list = biz.selectMenu(1000);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (ProductVO obj : list) {
			System.out.println(obj);
		}
	}

}
