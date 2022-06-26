package com.multisub.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multisub.frame.Biz;
import com.multisub.mapper.ProductMapper;
import com.multisub.vo.ProductVO;

@Service
public class ProductBiz implements Biz<Integer, ProductVO> {

	@Autowired
	ProductMapper dao;
	
	@Override
	public void register(ProductVO v) throws Exception {
		dao.insert(v);
		
	}

	@Override
	public void modify(ProductVO v) throws Exception {
		dao.update(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
		
	}

	@Override
	public ProductVO get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return dao.select(k);
	}

	@Override
	public List<ProductVO> get() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
	
	public List<ProductVO> selectMenu(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectMenu(k);
	}

}