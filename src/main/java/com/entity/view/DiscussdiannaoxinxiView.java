package com.entity.view;

import com.entity.DiscussdiannaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电脑信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-22 14:12:14
 */
@TableName("discussdiannaoxinxi")
public class DiscussdiannaoxinxiView  extends DiscussdiannaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussdiannaoxinxiView(){
	}
 
 	public DiscussdiannaoxinxiView(DiscussdiannaoxinxiEntity discussdiannaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussdiannaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
