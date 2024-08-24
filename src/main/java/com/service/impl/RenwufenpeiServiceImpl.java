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


import com.dao.RenwufenpeiDao;
import com.entity.RenwufenpeiEntity;
import com.service.RenwufenpeiService;
import com.entity.vo.RenwufenpeiVO;
import com.entity.view.RenwufenpeiView;

@Service("renwufenpeiService")
public class RenwufenpeiServiceImpl extends ServiceImpl<RenwufenpeiDao, RenwufenpeiEntity> implements RenwufenpeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwufenpeiEntity> page = this.selectPage(
                new Query<RenwufenpeiEntity>(params).getPage(),
                new EntityWrapper<RenwufenpeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwufenpeiEntity> wrapper) {
		  Page<RenwufenpeiView> page =new Query<RenwufenpeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<RenwufenpeiVO> selectListVO(Wrapper<RenwufenpeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwufenpeiVO selectVO(Wrapper<RenwufenpeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwufenpeiView> selectListView(Wrapper<RenwufenpeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwufenpeiView selectView(Wrapper<RenwufenpeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
