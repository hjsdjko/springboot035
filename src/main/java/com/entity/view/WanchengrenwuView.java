package com.entity.view;

import com.entity.WanchengrenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 完成任务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-22 18:17:39
 */
@TableName("wanchengrenwu")
public class WanchengrenwuView  extends WanchengrenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WanchengrenwuView(){
	}
 
 	public WanchengrenwuView(WanchengrenwuEntity wanchengrenwuEntity){
 	try {
			BeanUtils.copyProperties(this, wanchengrenwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
