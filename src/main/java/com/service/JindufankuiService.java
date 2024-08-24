package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JindufankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JindufankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JindufankuiView;


/**
 * 进度反馈
 *
 * @author 
 * @email 
 * @date 2024-04-22 18:17:39
 */
public interface JindufankuiService extends IService<JindufankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JindufankuiVO> selectListVO(Wrapper<JindufankuiEntity> wrapper);
   	
   	JindufankuiVO selectVO(@Param("ew") Wrapper<JindufankuiEntity> wrapper);
   	
   	List<JindufankuiView> selectListView(Wrapper<JindufankuiEntity> wrapper);
   	
   	JindufankuiView selectView(@Param("ew") Wrapper<JindufankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JindufankuiEntity> wrapper);

   	

}

