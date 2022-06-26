package com.multisub.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multisub.frame.Biz;
import com.multisub.mapper.CategoryMapper;
import com.multisub.vo.CategoryVO;

@Service
public class CategoryBiz implements Biz<Integer, CategoryVO> {

	@Autowired
	CategoryMapper dao;
	
	@Override
	public void register(CategoryVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(CategoryVO v) throws Exception {
		dao.update(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
		
	}

	@Override
	public CategoryVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<CategoryVO> get() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

}