package com.multisub.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multisub.vo.OrdersDetailVO;

@Repository
@Mapper
public interface OrdersDetailMapper {
	public void insert(OrdersDetailVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(OrdersDetailVO obj) throws Exception;
	public OrdersDetailVO select(int obj) throws Exception;
	public List<OrdersDetailVO> selectAll() throws Exception;
	public List<OrdersDetailVO> selectOrderBoxAll() throws Exception;
	public int selectOrderBoxCountAll() throws Exception;
}


