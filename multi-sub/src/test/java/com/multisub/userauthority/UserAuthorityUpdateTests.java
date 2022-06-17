package com.multisub.userauthority;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.UserAuthorityBiz;
import com.multisub.vo.UserAuthorityVO;

@SpringBootTest
class UserAuthorityUpdateTests {

	@Autowired
	UserAuthorityBiz uabiz;
	
	@Test
	void contextLoads() {
		UserAuthorityVO ua = new UserAuthorityVO(400,"비직원");
		
		try {
			uabiz.modify(ua);
			System.out.println("Update OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
