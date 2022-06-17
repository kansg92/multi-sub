package com.multisub.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multisub.vo.CouponDetailVO;

@Repository
@Mapper
public interface CouponDetailMapper {
	public void insert(CouponDetailVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(CouponDetailVO obj) throws Exception;
	public CouponDetailVO select(int obj) throws Exception;
	public CouponDetailVO selectDetail(int obj) throws Exception;
	public List<CouponDetailVO> selectAll() throws Exception;
	public List<CouponDetailVO> selectDetailAll() throws Exception;
}


