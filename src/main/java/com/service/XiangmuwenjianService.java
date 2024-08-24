package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmuwenjianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmuwenjianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmuwenjianView;


/**
 * 项目文件
 *
 * @author 
 * @email 
 * @date 2024-04-22 18:17:40
 */
public interface XiangmuwenjianService extends IService<XiangmuwenjianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmuwenjianVO> selectListVO(Wrapper<XiangmuwenjianEntity> wrapper);
   	
   	XiangmuwenjianVO selectVO(@Param("ew") Wrapper<XiangmuwenjianEntity> wrapper);
   	
   	List<XiangmuwenjianView> selectListView(Wrapper<XiangmuwenjianEntity> wrapper);
   	
   	XiangmuwenjianView selectView(@Param("ew") Wrapper<XiangmuwenjianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmuwenjianEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XiangmuwenjianEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XiangmuwenjianEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XiangmuwenjianEntity> wrapper);



}

