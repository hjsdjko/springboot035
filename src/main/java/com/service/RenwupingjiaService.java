package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwupingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwupingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwupingjiaView;


/**
 * 任务评价
 *
 * @author 
 * @email 
 * @date 2024-04-22 18:17:40
 */
public interface RenwupingjiaService extends IService<RenwupingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwupingjiaVO> selectListVO(Wrapper<RenwupingjiaEntity> wrapper);
   	
   	RenwupingjiaVO selectVO(@Param("ew") Wrapper<RenwupingjiaEntity> wrapper);
   	
   	List<RenwupingjiaView> selectListView(Wrapper<RenwupingjiaEntity> wrapper);
   	
   	RenwupingjiaView selectView(@Param("ew") Wrapper<RenwupingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwupingjiaEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<RenwupingjiaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<RenwupingjiaEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<RenwupingjiaEntity> wrapper);



}

