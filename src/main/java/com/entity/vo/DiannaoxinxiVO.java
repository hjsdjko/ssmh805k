package com.entity.vo;

import com.entity.DiannaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 电脑信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
public class DiannaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
