package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WanchengrenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WanchengrenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WanchengrenwuView;


/**
 * 完成任务
 *
 * @author 
 * @email 
 * @date 2024-04-22 18:17:39
 */
public interface WanchengrenwuService extends IService<WanchengrenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WanchengrenwuVO> selectListVO(Wrapper<WanchengrenwuEntity> wrapper);
   	
   	WanchengrenwuVO selectVO(@Param("ew") Wrapper<WanchengrenwuEntity> wrapper);
   	
   	List<WanchengrenwuView> selectListView(Wrapper<WanchengrenwuEntity> wrapper);
   	
   	WanchengrenwuView selectView(@Param("ew") Wrapper<WanchengrenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WanchengrenwuEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<WanchengrenwuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<WanchengrenwuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<WanchengrenwuEntity> wrapper);



}

