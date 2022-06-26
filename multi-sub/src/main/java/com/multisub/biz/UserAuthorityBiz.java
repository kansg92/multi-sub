package com.multisub.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multisub.frame.Biz;
import com.multisub.mapper.UserAuthorityMapper;
import com.multisub.vo.UserAuthorityVO;

@Service
public class UserAuthorityBiz implements Biz<Integer, UserAuthorityVO>{
	
	@Autowired
	UserAuthorityMapper dao;
	
	@Override
	public void register(UserAuthorityVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(UserAuthorityVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public UserAuthorityVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<UserAuthorityVO> get() throws Exception {
		return dao.selectAll();
	}
	
	public UserAuthorityVO getuads(Integer k) throws Exception {
		return dao.selectDetail(k);
	}
	
	public List<UserAuthorityVO> getuadas() throws Exception {
		return dao.selectDetailAll();
	}
	
	
}