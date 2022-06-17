package com.multisub.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multisub.frame.Biz;
import com.multisub.mapper.NutritionMapper;
import com.multisub.vo.NutritionVO;
@Service
public class NutritionBiz implements Biz<Integer, NutritionVO> {
	
	@Autowired
	NutritionMapper dao;
	
	@Override
	public void register(NutritionVO v) throws Exception {
		 dao.insert(v);		
	}

	@Override
	public void modify(NutritionVO v) throws Exception {
		dao.update(v);		
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);		
	}

	@Override
	public NutritionVO get(Integer k) throws Exception {		
		return dao.select(k);
	}

	@Override
	public List<NutritionVO> get() throws Exception {		
		return dao.selectAll();
	}

}
