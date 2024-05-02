package com.entity.model;

import com.entity.DiannaopingceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 电脑评测
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
public class DiannaopingceModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电脑分类
	 */
	
	private String diannaofenlei;
		
	/**
	 * 电脑品牌
	 */
	
	private String diannaopinpai;
		
	/**
	 * 电脑封面
	 */
	
	private String diannaofengmian;
		
	/**
	 * 测评信息
	 */
	
	private String cepingxinxi;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：电脑分类
	 */
	 
	public void setDiannaofenlei(String diannaofenlei) {
		this.diannaofenlei = diannaofenlei;
	}
	
	/**
	 * 获取：电脑分类
	 */
	public String getDiannaofenlei() {
		return diannaofenlei;
	}
				
	
	/**
	 * 设置：电脑品牌
	 */
	 
	public void setDiannaopinpai(String diannaopinpai) {
		this.diannaopinpai = diannaopinpai;
	}
	
	/**
	 * 获取：电脑品牌
	 */
	public String getDiannaopinpai() {
		return diannaopinpai;
	}
				
	
	/**
	 * 设置：电脑封面
	 */
	 
	public void setDiannaofengmian(String diannaofengmian) {
		this.diannaofengmian = diannaofengmian;
	}
	
	/**
	 * 获取：电脑封面
	 */
	public String getDiannaofengmian() {
		return diannaofengmian;
	}
				
	
	/**
	 * 设置：测评信息
	 */
	 
	public void setCepingxinxi(String cepingxinxi) {
		this.cepingxinxi = cepingxinxi;
	}
	
	/**
	 * 获取：测评信息
	 */
	public String getCepingxinxi() {
		return cepingxinxi;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
