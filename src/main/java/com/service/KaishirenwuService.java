package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaishirenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaishirenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaishirenwuView;


/**
 * 开始任务
 *
 * @author 
 * @email 
 * @date 2024-04-22 18:17:39
 */
public interface KaishirenwuService extends IService<KaishirenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaishirenwuVO> selectListVO(Wrapper<KaishirenwuEntity> wrapper);
   	
   	KaishirenwuVO selectVO(@Param("ew") Wrapper<KaishirenwuEntity> wrapper);
   	
   	List<KaishirenwuView> selectListView(Wrapper<KaishirenwuEntity> wrapper);
   	
   	KaishirenwuView selectView(@Param("ew") Wrapper<KaishirenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaishirenwuEntity> wrapper);

   	

}

