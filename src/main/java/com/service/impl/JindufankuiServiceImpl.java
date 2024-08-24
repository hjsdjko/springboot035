package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JindufankuiDao;
import com.entity.JindufankuiEntity;
import com.service.JindufankuiService;
import com.entity.vo.JindufankuiVO;
import com.entity.view.JindufankuiView;

@Service("jindufankuiService")
public class JindufankuiServiceImpl extends ServiceImpl<JindufankuiDao, JindufankuiEntity> implements JindufankuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JindufankuiEntity> page = this.selectPage(
                new Query<JindufankuiEntity>(params).getPage(),
                new EntityWrapper<JindufankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JindufankuiEntity> wrapper) {
		  Page<JindufankuiView> page =new Query<JindufankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JindufankuiVO> selectListVO(Wrapper<JindufankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JindufankuiVO selectVO(Wrapper<JindufankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JindufankuiView> selectListView(Wrapper<JindufankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JindufankuiView selectView(Wrapper<JindufankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
