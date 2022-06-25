package com.multisub.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multisub.vo.ToppingVO;

@Repository
@Mapper
public interface ToppingMapper {
	public void insert(ToppingVO obj) throws Exception;
	public void update(ToppingVO obj) throws Exception;
	public void delete(int id) throws Exception;
	public ToppingVO select(int id) throws Exception;
	public List<ToppingVO> selectAll() throws Exception;
	public List<ToppingVO> selectMenu(int cateId) throws Exception;
	public int getPrice(int id) throws Exception;
}
