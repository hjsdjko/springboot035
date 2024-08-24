package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.RenwufenpeiEntity;
import com.entity.view.RenwufenpeiView;

import com.service.RenwufenpeiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 任务分配
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-22 18:17:39
 */
@RestController
@RequestMapping("/renwufenpei")
public class RenwufenpeiController {
    @Autowired
    private RenwufenpeiService renwufenpeiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RenwufenpeiEntity renwufenpei,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			renwufenpei.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<RenwufenpeiEntity> ew = new EntityWrapper<RenwufenpeiEntity>();

		PageUtils page = renwufenpeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renwufenpei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RenwufenpeiEntity renwufenpei, 
		HttpServletRequest request){
        EntityWrapper<RenwufenpeiEntity> ew = new EntityWrapper<RenwufenpeiEntity>();

		PageUtils page = renwufenpeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renwufenpei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RenwufenpeiEntity renwufenpei){
       	EntityWrapper<RenwufenpeiEntity> ew = new EntityWrapper<RenwufenpeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( renwufenpei, "renwufenpei")); 
        return R.ok().put("data", renwufenpeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RenwufenpeiEntity renwufenpei){
        EntityWrapper< RenwufenpeiEntity> ew = new EntityWrapper< RenwufenpeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( renwufenpei, "renwufenpei")); 
		RenwufenpeiView renwufenpeiView =  renwufenpeiService.selectView(ew);
		return R.ok("查询任务分配成功").put("data", renwufenpeiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RenwufenpeiEntity renwufenpei = renwufenpeiService.selectById(id);
        return R.ok().put("data", renwufenpei);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RenwufenpeiEntity renwufenpei = renwufenpeiService.selectById(id);
        return R.ok().put("data", renwufenpei);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RenwufenpeiEntity renwufenpei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(renwufenpei);
        renwufenpeiService.insert(renwufenpei);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RenwufenpeiEntity renwufenpei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(renwufenpei);
        renwufenpeiService.insert(renwufenpei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody RenwufenpeiEntity renwufenpei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(renwufenpei);
        renwufenpeiService.updateById(renwufenpei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        renwufenpeiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
