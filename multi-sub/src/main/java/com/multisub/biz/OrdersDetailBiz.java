package com.multisub.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multisub.frame.Biz;
import com.multisub.mapper.OrdersDetailMapper;
import com.multisub.vo.OrdersDetailVO;

@Service
public class OrdersDetailBiz implements Biz<Integer, OrdersDetailVO> {

	@Autowired
	OrdersDetailMapper dao;
	
	@Override
	public void register(OrdersDetailVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(OrdersDetailVO v) throws Exception {
		dao.update(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
		
	}

	@Override
	public OrdersDetailVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<OrdersDetailVO> get() throws Exception {
		return dao.selectAll();
	}
	
	public List<OrdersDetailVO> getsoba() throws Exception {
		return dao.selectOrderBoxAll();
	}
	
	public int getsobca() throws Exception {
		return dao.selectOrderBoxCountAll();
	}

}