package com.multisub.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.UsersBiz;
import com.multisub.vo.UsersVO;

@SpringBootTest
class UsersInsertTests {

	@Autowired
	UsersBiz ubiz;
	
	@Test
	void contextLoads() {
		UsersVO users = new UsersVO("id03","pwd03","back","back@gmail.com","incheon","010-5462-4861",700,"M-101-12312",null,300);
		
		try {
			ubiz.register(users);
			System.out.println("Register OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
