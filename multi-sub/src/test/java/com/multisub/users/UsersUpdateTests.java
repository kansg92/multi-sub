package com.multisub.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.UsersBiz;
import com.multisub.vo.UsersVO;

@SpringBootTest
class UsersUpdateTests {

	@Autowired
	UsersBiz ubiz;
	
	@Test
	void contextLoads() {
		UsersVO users = new UsersVO("id03", "pwd03", "yang", "yang@daum.net","gyeongbuk","010-0896-7894", 1000,"M-780-50489",200);
		
		try {
			ubiz.modify(users);
			System.out.println("Update OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
