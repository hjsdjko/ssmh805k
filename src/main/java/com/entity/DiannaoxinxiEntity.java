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
 * 电脑信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
@TableName("diannaoxinxi")
public class DiannaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DiannaoxinxiEntity() {
		
	}
	
	public DiannaoxinxiEntity(T t) {
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
	 * 电脑编号
	 */
					
	private String diannaobianhao;
	
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
	 * 电脑价格
	 */
					
	private Integer diannaojiage;
	
	/**
	 * 电脑配置
	 */
					
	private String diannaopeizhi;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：电脑编号
	 */
	public void setDiannaobianhao(String diannaobianhao) {
		this.diannaobianhao = diannaobianhao;
	}
	/**
	 * 获取：电脑编号
	 */
	public String getDiannaobianhao() {
		return diannaobianhao;
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
	 * 设置：电脑价格
	 */
	public void setDiannaojiage(Integer diannaojiage) {
		this.diannaojiage = diannaojiage;
	}
	/**
	 * 获取：电脑价格
	 */
	public Integer getDiannaojiage() {
		return diannaojiage;
	}
	/**
	 * 设置：电脑配置
	 */
	public void setDiannaopeizhi(String diannaopeizhi) {
		this.diannaopeizhi = diannaopeizhi;
	}
	/**
	 * 获取：电脑配置
	 */
	public String getDiannaopeizhi() {
		return diannaopeizhi;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
