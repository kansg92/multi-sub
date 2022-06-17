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
		UsersVO users = new UsersVO("id04", "pwd04", "choi", "choi@daum.net","gyeongbuk","010-2222-3333", 700,"M-780-50489",null,4);
		
		try {
			ubiz.register(users);
			System.out.println("Register OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
