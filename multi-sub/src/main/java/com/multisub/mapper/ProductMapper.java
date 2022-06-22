package com.multisub.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multisub.vo.ProductVO;

@Repository
@Mapper
public interface ProductMapper {
	public void insert(ProductVO obj) throws Exception;
	public void update(ProductVO obj) throws Exception;
	public void delete(int id) throws Exception;
	public ProductVO select(int id) throws Exception;
	public List<ProductVO> selectAll() throws Exception;
	public List<ProductVO> selectMenu(int cid) throws Exception;
}
