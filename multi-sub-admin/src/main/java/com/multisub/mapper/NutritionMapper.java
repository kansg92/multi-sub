package com.multisub.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
 
import com.multisub.vo.NutritionVO;

@Repository
@Mapper
public interface NutritionMapper {
	public void insert(NutritionVO n) throws Exception;
	public void update(NutritionVO n) throws Exception;
	public void delete(int id) throws Exception;
	public NutritionVO select(int id) throws Exception;
	public List<NutritionVO> selectAll() throws Exception;
}
 
