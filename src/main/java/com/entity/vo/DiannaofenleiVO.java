package com.entity.vo;

import com.entity.DiannaofenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 电脑分类
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
public class DiannaofenleiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 单位
	 */
	
	private String danwei;
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：单位
	 */
	 
	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}
	
	/**
	 * 获取：单位
	 */
	public String getDanwei() {
		return danwei;
	}
			
}
