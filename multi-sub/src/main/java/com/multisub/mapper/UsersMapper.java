package com.multisub.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multisub.vo.UsersVO;

@Repository
@Mapper
public interface UsersMapper {
	public void insert(UsersVO obj) throws Exception;
	public void delete(String obj) throws Exception;
	public void update(UsersVO obj) throws Exception;
	public UsersVO select(String obj) throws Exception;
	public UsersVO selectDetail(String obj) throws Exception;
	public List<UsersVO> selectAll() throws Exception;
	public List<UsersVO> selectDetailAll() throws Exception;
	public int checkUsers(String id) throws Exception;
}
