package com.entity.view;

import com.entity.DiannaopingceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电脑评测
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
@TableName("diannaopingce")
public class DiannaopingceView  extends DiannaopingceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiannaopingceView(){
	}
 
 	public DiannaopingceView(DiannaopingceEntity diannaopingceEntity){
 	try {
			BeanUtils.copyProperties(this, diannaopingceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
