package com.dao;

import com.entity.RenwupingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwupingjiaVO;
import com.entity.view.RenwupingjiaView;


/**
 * 任务评价
 * 
 * @author 
 * @email 
 * @date 2024-04-22 18:17:40
 */
public interface RenwupingjiaDao extends BaseMapper<RenwupingjiaEntity> {
	
	List<RenwupingjiaVO> selectListVO(@Param("ew") Wrapper<RenwupingjiaEntity> wrapper);
	
	RenwupingjiaVO selectVO(@Param("ew") Wrapper<RenwupingjiaEntity> wrapper);
	
	List<RenwupingjiaView> selectListView(@Param("ew") Wrapper<RenwupingjiaEntity> wrapper);

	List<RenwupingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<RenwupingjiaEntity> wrapper);

	
	RenwupingjiaView selectView(@Param("ew") Wrapper<RenwupingjiaEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RenwupingjiaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RenwupingjiaEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RenwupingjiaEntity> wrapper);



}
