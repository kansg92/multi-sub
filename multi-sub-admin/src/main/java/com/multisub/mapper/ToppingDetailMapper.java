package com.multisub.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multisub.vo.ToppingDetailVO;

@Repository
@Mapper
public interface ToppingDetailMapper {
	public void insert(ToppingDetailVO obj) throws Exception;
	public void update(ToppingDetailVO obj) throws Exception;
	public void delete(int id) throws Exception;
	public ToppingDetailVO select(int id) throws Exception;
	public List<ToppingDetailVO> selectAll() throws Exception;
}
