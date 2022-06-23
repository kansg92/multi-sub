package com.multisub.users;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multisub.biz.UsersBiz;
import com.multisub.vo.UsersVO;

@SpringBootTest
class UsersSelectAllTest {
	
	@Autowired
	UsersBiz ubiz;
	
	@Test
	void contextLoads() {
		List<UsersVO> list = null;
		
		try {
			list = ubiz.get();
			for (UsersVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
