package com.multisub.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.ProductBiz;
import com.multisub.vo.ProductVO;

@SpringBootTest
class UpdateTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		ProductVO obj = new ProductVO(2, "test update",45000, "사진 변경");
		
		try {
			biz.modify(obj);
			
			System.out.println(biz.get(2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
