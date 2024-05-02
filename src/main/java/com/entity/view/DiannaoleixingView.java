package com.entity.view;

import com.entity.DiannaoleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电脑类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
@TableName("diannaoleixing")
public class DiannaoleixingView  extends DiannaoleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiannaoleixingView(){
	}
 
 	public DiannaoleixingView(DiannaoleixingEntity diannaoleixingEntity){
 	try {
			BeanUtils.copyProperties(this, diannaoleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
