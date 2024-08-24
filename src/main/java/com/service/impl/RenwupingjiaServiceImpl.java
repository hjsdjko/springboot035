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


import com.dao.RenwupingjiaDao;
import com.entity.RenwupingjiaEntity;
import com.service.RenwupingjiaService;
import com.entity.vo.RenwupingjiaVO;
import com.entity.view.RenwupingjiaView;

@Service("renwupingjiaService")
public class RenwupingjiaServiceImpl extends ServiceImpl<RenwupingjiaDao, RenwupingjiaEntity> implements RenwupingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwupingjiaEntity> page = this.selectPage(
                new Query<RenwupingjiaEntity>(params).getPage(),
                new EntityWrapper<RenwupingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwupingjiaEntity> wrapper) {
		  Page<RenwupingjiaView> page =new Query<RenwupingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<RenwupingjiaVO> selectListVO(Wrapper<RenwupingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwupingjiaVO selectVO(Wrapper<RenwupingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwupingjiaView> selectListView(Wrapper<RenwupingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwupingjiaView selectView(Wrapper<RenwupingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<RenwupingjiaEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<RenwupingjiaEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<RenwupingjiaEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
