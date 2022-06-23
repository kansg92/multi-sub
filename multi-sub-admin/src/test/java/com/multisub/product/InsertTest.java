package com.multisub.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.ProductBiz;
import com.multisub.vo.ProductVO;

@SpringBootTest
class InsertTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		ProductVO obj = new ProductVO(0,"아보카토샌드위치(test)", 6000,"사진1",null,1000,1);
		
		try {
			biz.register(obj);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
