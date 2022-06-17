package com.multisub.userauthority;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.UserAuthorityBiz;
import com.multisub.vo.UserAuthorityVO;

@SpringBootTest
class UserAuthorityInsertTests {

	@Autowired
	UserAuthorityBiz uabiz;
	
	@Test
	void contextLoads() {
		
		UserAuthorityVO ua = new UserAuthorityVO(300, "직원");
		
		try {
			uabiz.register(ua);
			System.out.println("Register OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
