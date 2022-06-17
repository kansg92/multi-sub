package com.multisub.userauthority;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.UserAuthorityBiz;

@SpringBootTest
class UserAuthorityDeleteTest {
	
	@Autowired
	UserAuthorityBiz uabiz;
	
	@Test
	void contextLoads() {
		try {
			uabiz.remove(300);
			System.out.println("Delete OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
