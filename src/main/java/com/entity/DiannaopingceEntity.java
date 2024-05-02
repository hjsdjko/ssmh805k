package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 电脑评测
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
@TableName("diannaopingce")
public class DiannaopingceEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DiannaopingceEntity() {
		
	}
	
	public DiannaopingceEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 电脑名称
	 */
					
	private String diannaomingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：电脑名称
	 */
	public void setDiannaomingcheng(String diannaomingcheng) {
		this.diannaomingcheng = diannaomingcheng;
	}
	/**
	 * 获取：电脑名称
	 */
	public String getDiannaomingcheng() {
		return diannaomingcheng;
	}
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
