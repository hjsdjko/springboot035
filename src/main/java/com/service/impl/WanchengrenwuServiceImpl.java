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


import com.dao.WanchengrenwuDao;
import com.entity.WanchengrenwuEntity;
import com.service.WanchengrenwuService;
import com.entity.vo.WanchengrenwuVO;
import com.entity.view.WanchengrenwuView;

@Service("wanchengrenwuService")
public class WanchengrenwuServiceImpl extends ServiceImpl<WanchengrenwuDao, WanchengrenwuEntity> implements WanchengrenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WanchengrenwuEntity> page = this.selectPage(
                new Query<WanchengrenwuEntity>(params).getPage(),
                new EntityWrapper<WanchengrenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WanchengrenwuEntity> wrapper) {
		  Page<WanchengrenwuView> page =new Query<WanchengrenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<WanchengrenwuVO> selectListVO(Wrapper<WanchengrenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WanchengrenwuVO selectVO(Wrapper<WanchengrenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WanchengrenwuView> selectListView(Wrapper<WanchengrenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WanchengrenwuView selectView(Wrapper<WanchengrenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<WanchengrenwuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<WanchengrenwuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<WanchengrenwuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
