package com.entity.model;

import com.entity.XiangmuwenjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 项目文件
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-22 18:17:40
 */
public class XiangmuwenjianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目分类
	 */
	
	private String xiangmufenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 文件
	 */
	
	private String wenjian;
		
	/**
	 * 视频
	 */
	
	private String shipin;
		
	/**
	 * 项目风险
	 */
	
	private String xiangmufengxian;
		
	/**
	 * 时间线
	 */
	
	private String shijianxian;
		
	/**
	 * 里程碑
	 */
	
	private String lichengbei;
		
	/**
	 * 文件详情
	 */
	
	private String wenjianxiangqing;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
				
	
	/**
	 * 设置：项目分类
	 */
	 
	public void setXiangmufenlei(String xiangmufenlei) {
		this.xiangmufenlei = xiangmufenlei;
	}
	
	/**
	 * 获取：项目分类
	 */
	public String getXiangmufenlei() {
		return xiangmufenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：文件
	 */
	 
	public void setWenjian(String wenjian) {
		this.wenjian = wenjian;
	}
	
	/**
	 * 获取：文件
	 */
	public String getWenjian() {
		return wenjian;
	}
				
	
	/**
	 * 设置：视频
	 */
	 
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
				
	
	/**
	 * 设置：项目风险
	 */
	 
	public void setXiangmufengxian(String xiangmufengxian) {
		this.xiangmufengxian = xiangmufengxian;
	}
	
	/**
	 * 获取：项目风险
	 */
	public String getXiangmufengxian() {
		return xiangmufengxian;
	}
				
	
	/**
	 * 设置：时间线
	 */
	 
	public void setShijianxian(String shijianxian) {
		this.shijianxian = shijianxian;
	}
	
	/**
	 * 获取：时间线
	 */
	public String getShijianxian() {
		return shijianxian;
	}
				
	
	/**
	 * 设置：里程碑
	 */
	 
	public void setLichengbei(String lichengbei) {
		this.lichengbei = lichengbei;
	}
	
	/**
	 * 获取：里程碑
	 */
	public String getLichengbei() {
		return lichengbei;
	}
				
	
	/**
	 * 设置：文件详情
	 */
	 
	public void setWenjianxiangqing(String wenjianxiangqing) {
		this.wenjianxiangqing = wenjianxiangqing;
	}
	
	/**
	 * 获取：文件详情
	 */
	public String getWenjianxiangqing() {
		return wenjianxiangqing;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
			
}
