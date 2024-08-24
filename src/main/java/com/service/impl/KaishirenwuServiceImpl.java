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


import com.dao.KaishirenwuDao;
import com.entity.KaishirenwuEntity;
import com.service.KaishirenwuService;
import com.entity.vo.KaishirenwuVO;
import com.entity.view.KaishirenwuView;

@Service("kaishirenwuService")
public class KaishirenwuServiceImpl extends ServiceImpl<KaishirenwuDao, KaishirenwuEntity> implements KaishirenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaishirenwuEntity> page = this.selectPage(
                new Query<KaishirenwuEntity>(params).getPage(),
                new EntityWrapper<KaishirenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaishirenwuEntity> wrapper) {
		  Page<KaishirenwuView> page =new Query<KaishirenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<KaishirenwuVO> selectListVO(Wrapper<KaishirenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaishirenwuVO selectVO(Wrapper<KaishirenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaishirenwuView> selectListView(Wrapper<KaishirenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaishirenwuView selectView(Wrapper<KaishirenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
