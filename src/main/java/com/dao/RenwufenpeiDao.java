package com.dao;

import com.entity.RenwufenpeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwufenpeiVO;
import com.entity.view.RenwufenpeiView;


/**
 * 任务分配
 * 
 * @author 
 * @email 
 * @date 2024-04-22 18:17:39
 */
public interface RenwufenpeiDao extends BaseMapper<RenwufenpeiEntity> {
	
	List<RenwufenpeiVO> selectListVO(@Param("ew") Wrapper<RenwufenpeiEntity> wrapper);
	
	RenwufenpeiVO selectVO(@Param("ew") Wrapper<RenwufenpeiEntity> wrapper);
	
	List<RenwufenpeiView> selectListView(@Param("ew") Wrapper<RenwufenpeiEntity> wrapper);

	List<RenwufenpeiView> selectListView(Pagination page,@Param("ew") Wrapper<RenwufenpeiEntity> wrapper);

	
	RenwufenpeiView selectView(@Param("ew") Wrapper<RenwufenpeiEntity> wrapper);
	

}
