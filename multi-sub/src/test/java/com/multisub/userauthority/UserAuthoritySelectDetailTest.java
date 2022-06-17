package com.multisub.userauthority;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.UserAuthorityBiz;
import com.multisub.vo.UserAuthorityVO;

@SpringBootTest
class UserAuthoritySelectDetailTest {
	
	@Autowired
	UserAuthorityBiz uabiz;
	
	@Test
	void contextLoads() {
		UserAuthorityVO ua = null;
		
		try {
			ua = uabiz.getuads(200);
			System.out.println(ua);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
