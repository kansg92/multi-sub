package com.multisub.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multisub.frame.Biz;
import com.multisub.mapper.ToppingMapper;
import com.multisub.vo.ToppingVO;

@Service
public class ToppingBiz implements Biz<Integer, ToppingVO> {

	@Autowired
	ToppingMapper dao;
	
	@Override
	public void register(ToppingVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(ToppingVO v) throws Exception {
		dao.update(v);		
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);		
	}

	@Override
	public ToppingVO get(Integer k) throws Exception {		
		return dao.select(k);
	}

	@Override
	public List<ToppingVO> get() throws Exception {		
		return dao.selectAll();
				
	}
	
	public List<ToppingVO> selectMenu(Integer k) throws Exception {		
		return dao.selectMenu(k);
				
	}
	
	public int getPrice(Integer k) throws Exception {		
		return dao.getPrice(k);
	}

}