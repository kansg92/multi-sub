package com.multisub.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multisub.frame.Biz;
import com.multisub.mapper.CouponDetailMapper;
import com.multisub.vo.CouponDetailVO;

@Service
public class CouponDetailBiz implements Biz<Integer, CouponDetailVO>{
	
	@Autowired
	CouponDetailMapper dao;
	
	@Override
	public void register(CouponDetailVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(CouponDetailVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public CouponDetailVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<CouponDetailVO> get() throws Exception {
		return dao.selectAll();
	}
	
	public CouponDetailVO getsd(Integer k) throws Exception {
		return dao.selectDetail(k);
	}
	
	public List<CouponDetailVO> getsda() throws Exception {
		return dao.selectDetailAll();
	}
	
}