package com.multisub.userauthority;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.UserAuthorityBiz;
import com.multisub.vo.UserAuthorityVO;

@SpringBootTest
class UserAuthoritySelectAllDetailTest {
	
	@Autowired
	UserAuthorityBiz uabiz;
	
	@Test
	void contextLoads() {
		List<UserAuthorityVO> list = null;
		
		try {
			list = uabiz.getuadas();
			for (UserAuthorityVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
