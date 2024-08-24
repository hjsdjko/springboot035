package com.dao;

import com.entity.WanchengrenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WanchengrenwuVO;
import com.entity.view.WanchengrenwuView;


/**
 * 完成任务
 * 
 * @author 
 * @email 
 * @date 2024-04-22 18:17:39
 */
public interface WanchengrenwuDao extends BaseMapper<WanchengrenwuEntity> {
	
	List<WanchengrenwuVO> selectListVO(@Param("ew") Wrapper<WanchengrenwuEntity> wrapper);
	
	WanchengrenwuVO selectVO(@Param("ew") Wrapper<WanchengrenwuEntity> wrapper);
	
	List<WanchengrenwuView> selectListView(@Param("ew") Wrapper<WanchengrenwuEntity> wrapper);

	List<WanchengrenwuView> selectListView(Pagination page,@Param("ew") Wrapper<WanchengrenwuEntity> wrapper);

	
	WanchengrenwuView selectView(@Param("ew") Wrapper<WanchengrenwuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WanchengrenwuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WanchengrenwuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WanchengrenwuEntity> wrapper);



}
