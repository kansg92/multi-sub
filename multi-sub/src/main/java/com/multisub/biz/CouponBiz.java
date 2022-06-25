package com.multisub.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multisub.frame.Biz;
import com.multisub.mapper.CouponMapper;
import com.multisub.vo.CouponVO;

@Service
public class CouponBiz implements Biz<Integer, CouponVO>{
	
	@Autowired
	CouponMapper dao;
	
	@Override
	public void register(CouponVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(CouponVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public CouponVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<CouponVO> get() throws Exception {
		return dao.selectAll();
	}
	
	public List<CouponVO> getba() throws Exception {
		return dao.selectBoxAll();
	}
	
	public int getCouponCnt() throws Exception {
		return dao.selectBoxCount();
	}
	
	
}