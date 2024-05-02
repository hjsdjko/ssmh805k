package com.dao;

import com.entity.DiannaopingceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiannaopingceVO;
import com.entity.view.DiannaopingceView;


/**
 * 电脑评测
 * 
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
public interface DiannaopingceDao extends BaseMapper<DiannaopingceEntity> {
	
	List<DiannaopingceVO> selectListVO(@Param("ew") Wrapper<DiannaopingceEntity> wrapper);
	
	DiannaopingceVO selectVO(@Param("ew") Wrapper<DiannaopingceEntity> wrapper);
	
	List<DiannaopingceView> selectListView(@Param("ew") Wrapper<DiannaopingceEntity> wrapper);

	List<DiannaopingceView> selectListView(Pagination page,@Param("ew") Wrapper<DiannaopingceEntity> wrapper);
	
	DiannaopingceView selectView(@Param("ew") Wrapper<DiannaopingceEntity> wrapper);
	
}
