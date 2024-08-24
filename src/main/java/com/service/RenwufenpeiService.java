package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwufenpeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwufenpeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwufenpeiView;


/**
 * 任务分配
 *
 * @author 
 * @email 
 * @date 2024-04-22 18:17:39
 */
public interface RenwufenpeiService extends IService<RenwufenpeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwufenpeiVO> selectListVO(Wrapper<RenwufenpeiEntity> wrapper);
   	
   	RenwufenpeiVO selectVO(@Param("ew") Wrapper<RenwufenpeiEntity> wrapper);
   	
   	List<RenwufenpeiView> selectListView(Wrapper<RenwufenpeiEntity> wrapper);
   	
   	RenwufenpeiView selectView(@Param("ew") Wrapper<RenwufenpeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwufenpeiEntity> wrapper);

   	

}

