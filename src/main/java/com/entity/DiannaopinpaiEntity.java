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
 * 电脑品牌
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
@TableName("diannaopinpai")
public class DiannaopinpaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DiannaopinpaiEntity() {
		
	}
	
	public DiannaopinpaiEntity(T t) {
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
	 * 品牌编号
	 */
					
	private String pinpaibianhao;
	
	/**
	 * 品牌名称
	 */
					
	private String pinpaimingcheng;
	
	/**
	 * 品牌封面
	 */
					
	private String pinpaifengmian;
	
	/**
	 * 相关电脑
	 */
					
	private String xiangguandiannao;
	
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
	 * 设置：品牌编号
	 */
	public void setPinpaibianhao(String pinpaibianhao) {
		this.pinpaibianhao = pinpaibianhao;
	}
	/**
	 * 获取：品牌编号
	 */
	public String getPinpaibianhao() {
		return pinpaibianhao;
	}
	/**
	 * 设置：品牌名称
	 */
	public void setPinpaimingcheng(String pinpaimingcheng) {
		this.pinpaimingcheng = pinpaimingcheng;
	}
	/**
	 * 获取：品牌名称
	 */
	public String getPinpaimingcheng() {
		return pinpaimingcheng;
	}
	/**
	 * 设置：品牌封面
	 */
	public void setPinpaifengmian(String pinpaifengmian) {
		this.pinpaifengmian = pinpaifengmian;
	}
	/**
	 * 获取：品牌封面
	 */
	public String getPinpaifengmian() {
		return pinpaifengmian;
	}
	/**
	 * 设置：相关电脑
	 */
	public void setXiangguandiannao(String xiangguandiannao) {
		this.xiangguandiannao = xiangguandiannao;
	}
	/**
	 * 获取：相关电脑
	 */
	public String getXiangguandiannao() {
		return xiangguandiannao;
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
