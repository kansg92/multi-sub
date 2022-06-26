package com.multisub.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multisub.frame.Biz;
import com.multisub.mapper.ToppingDetailMapper;
import com.multisub.vo.ToppingDetailVO;

@Service
public class ToppingDetailBiz implements Biz<Integer, ToppingDetailVO> {

	@Autowired
	ToppingDetailMapper dao;
	
	@Override
	public void register(ToppingDetailVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(ToppingDetailVO v) throws Exception {
		dao.update(v);		
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);		
	}

	@Override
	public ToppingDetailVO get(Integer k) throws Exception {		
		return dao.select(k);
	}

	@Override
	public List<ToppingDetailVO> get() throws Exception {		
		return dao.selectAll();
				
	}

}