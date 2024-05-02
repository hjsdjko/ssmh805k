package com.entity.vo;

import com.entity.DiannaopinpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 电脑品牌
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
public class DiannaopinpaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
