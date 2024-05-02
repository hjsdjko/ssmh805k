package com.dao;

import com.entity.DiscussdiannaopingceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdiannaopingceVO;
import com.entity.view.DiscussdiannaopingceView;


/**
 * 电脑评测评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-22 14:12:14
 */
public interface DiscussdiannaopingceDao extends BaseMapper<DiscussdiannaopingceEntity> {
	
	List<DiscussdiannaopingceVO> selectListVO(@Param("ew") Wrapper<DiscussdiannaopingceEntity> wrapper);
	
	DiscussdiannaopingceVO selectVO(@Param("ew") Wrapper<DiscussdiannaopingceEntity> wrapper);
	
	List<DiscussdiannaopingceView> selectListView(@Param("ew") Wrapper<DiscussdiannaopingceEntity> wrapper);

	List<DiscussdiannaopingceView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdiannaopingceEntity> wrapper);
	
	DiscussdiannaopingceView selectView(@Param("ew") Wrapper<DiscussdiannaopingceEntity> wrapper);
	
}
