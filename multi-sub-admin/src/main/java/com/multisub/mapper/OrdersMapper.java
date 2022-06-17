package com.multisub.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multisub.vo.OrdersVO;

@Repository
@Mapper
public interface OrdersMapper {
	public void insert(OrdersVO orders) throws Exception;
	public void update(OrdersVO orders) throws Exception;
	public void delete(int id) throws Exception;
	public OrdersVO select(int id) throws Exception;
	public List<OrdersVO> selectAll() throws Exception;
}
