package com.dao;

import com.entity.KaishirenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaishirenwuVO;
import com.entity.view.KaishirenwuView;


/**
 * 开始任务
 * 
 * @author 
 * @email 
 * @date 2024-04-22 18:17:39
 */
public interface KaishirenwuDao extends BaseMapper<KaishirenwuEntity> {
	
	List<KaishirenwuVO> selectListVO(@Param("ew") Wrapper<KaishirenwuEntity> wrapper);
	
	KaishirenwuVO selectVO(@Param("ew") Wrapper<KaishirenwuEntity> wrapper);
	
	List<KaishirenwuView> selectListView(@Param("ew") Wrapper<KaishirenwuEntity> wrapper);

	List<KaishirenwuView> selectListView(Pagination page,@Param("ew") Wrapper<KaishirenwuEntity> wrapper);

	
	KaishirenwuView selectView(@Param("ew") Wrapper<KaishirenwuEntity> wrapper);
	

}
