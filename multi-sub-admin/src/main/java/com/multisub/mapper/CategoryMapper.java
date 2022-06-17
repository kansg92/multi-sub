package com.multisub.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multisub.vo.CategoryVO;

@Repository
@Mapper
public interface CategoryMapper {
	public void insert(CategoryVO cate) throws Exception;
	public void update(CategoryVO cate) throws Exception;
	public void delete(int id) throws Exception;
	public CategoryVO select(int id) throws Exception;
	public List<CategoryVO> selectAll() throws Exception;
}
