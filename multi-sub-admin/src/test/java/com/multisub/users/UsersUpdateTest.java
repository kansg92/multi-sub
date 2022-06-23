package com.multisub.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.ProductBiz;
import com.multisub.biz.UsersBiz;
import com.multisub.vo.ProductVO;
import com.multisub.vo.UsersVO;

@SpringBootTest
class UsersUpdateTest {

	@Autowired
	UsersBiz biz;
	
	@Test
	void contextLoads() {
		UsersVO obj = new UsersVO("id03","pwd03","back","back@gmail.com","incheon","010-5462-4861",700,"M-101-12312",null,300);
		
		try {
			biz.modify(obj);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
