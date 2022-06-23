package com.multisub.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.UsersBiz;
import com.multisub.vo.UsersVO;

@SpringBootTest
class UsersSelectTest {
	
	@Autowired
	UsersBiz ubiz;
	
	@Test
	void contextLoads() {
		UsersVO users = null;
		
		try {
			users = ubiz.get("id01");
			System.out.println(users);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
