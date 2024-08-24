package com.dao;

import com.entity.JindufankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JindufankuiVO;
import com.entity.view.JindufankuiView;


/**
 * 进度反馈
 * 
 * @author 
 * @email 
 * @date 2024-04-22 18:17:39
 */
public interface JindufankuiDao extends BaseMapper<JindufankuiEntity> {
	
	List<JindufankuiVO> selectListVO(@Param("ew") Wrapper<JindufankuiEntity> wrapper);
	
	JindufankuiVO selectVO(@Param("ew") Wrapper<JindufankuiEntity> wrapper);
	
	List<JindufankuiView> selectListView(@Param("ew") Wrapper<JindufankuiEntity> wrapper);

	List<JindufankuiView> selectListView(Pagination page,@Param("ew") Wrapper<JindufankuiEntity> wrapper);

	
	JindufankuiView selectView(@Param("ew") Wrapper<JindufankuiEntity> wrapper);
	

}
