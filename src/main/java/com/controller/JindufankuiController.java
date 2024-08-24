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

import com.entity.JindufankuiEntity;
import com.entity.view.JindufankuiView;

import com.service.JindufankuiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 进度反馈
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-22 18:17:39
 */
@RestController
@RequestMapping("/jindufankui")
public class JindufankuiController {
    @Autowired
    private JindufankuiService jindufankuiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JindufankuiEntity jindufankui,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jindufankui.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JindufankuiEntity> ew = new EntityWrapper<JindufankuiEntity>();

		PageUtils page = jindufankuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jindufankui), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JindufankuiEntity jindufankui, 
		HttpServletRequest request){
        EntityWrapper<JindufankuiEntity> ew = new EntityWrapper<JindufankuiEntity>();

		PageUtils page = jindufankuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jindufankui), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JindufankuiEntity jindufankui){
       	EntityWrapper<JindufankuiEntity> ew = new EntityWrapper<JindufankuiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jindufankui, "jindufankui")); 
        return R.ok().put("data", jindufankuiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JindufankuiEntity jindufankui){
        EntityWrapper< JindufankuiEntity> ew = new EntityWrapper< JindufankuiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jindufankui, "jindufankui")); 
		JindufankuiView jindufankuiView =  jindufankuiService.selectView(ew);
		return R.ok("查询进度反馈成功").put("data", jindufankuiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JindufankuiEntity jindufankui = jindufankuiService.selectById(id);
        return R.ok().put("data", jindufankui);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JindufankuiEntity jindufankui = jindufankuiService.selectById(id);
        return R.ok().put("data", jindufankui);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JindufankuiEntity jindufankui, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jindufankui);
        jindufankuiService.insert(jindufankui);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JindufankuiEntity jindufankui, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jindufankui);
        jindufankuiService.insert(jindufankui);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JindufankuiEntity jindufankui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jindufankui);
        jindufankuiService.updateById(jindufankui);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jindufankuiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
