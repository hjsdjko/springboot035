package com.entity.view;

import com.entity.RenwufenpeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 任务分配
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-22 18:17:39
 */
@TableName("renwufenpei")
public class RenwufenpeiView  extends RenwufenpeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenwufenpeiView(){
	}
 
 	public RenwufenpeiView(RenwufenpeiEntity renwufenpeiEntity){
 	try {
			BeanUtils.copyProperties(this, renwufenpeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
