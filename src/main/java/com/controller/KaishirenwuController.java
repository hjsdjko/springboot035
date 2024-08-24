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

import com.entity.KaishirenwuEntity;
import com.entity.view.KaishirenwuView;

import com.service.KaishirenwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 开始任务
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-22 18:17:39
 */
@RestController
@RequestMapping("/kaishirenwu")
public class KaishirenwuController {
    @Autowired
    private KaishirenwuService kaishirenwuService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KaishirenwuEntity kaishirenwu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			kaishirenwu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KaishirenwuEntity> ew = new EntityWrapper<KaishirenwuEntity>();

		PageUtils page = kaishirenwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaishirenwu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KaishirenwuEntity kaishirenwu, 
		HttpServletRequest request){
        EntityWrapper<KaishirenwuEntity> ew = new EntityWrapper<KaishirenwuEntity>();

		PageUtils page = kaishirenwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaishirenwu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KaishirenwuEntity kaishirenwu){
       	EntityWrapper<KaishirenwuEntity> ew = new EntityWrapper<KaishirenwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kaishirenwu, "kaishirenwu")); 
        return R.ok().put("data", kaishirenwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KaishirenwuEntity kaishirenwu){
        EntityWrapper< KaishirenwuEntity> ew = new EntityWrapper< KaishirenwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kaishirenwu, "kaishirenwu")); 
		KaishirenwuView kaishirenwuView =  kaishirenwuService.selectView(ew);
		return R.ok("查询开始任务成功").put("data", kaishirenwuView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KaishirenwuEntity kaishirenwu = kaishirenwuService.selectById(id);
        return R.ok().put("data", kaishirenwu);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KaishirenwuEntity kaishirenwu = kaishirenwuService.selectById(id);
        return R.ok().put("data", kaishirenwu);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KaishirenwuEntity kaishirenwu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kaishirenwu);
        kaishirenwuService.insert(kaishirenwu);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KaishirenwuEntity kaishirenwu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kaishirenwu);
        kaishirenwuService.insert(kaishirenwu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KaishirenwuEntity kaishirenwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kaishirenwu);
        kaishirenwuService.updateById(kaishirenwu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kaishirenwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
