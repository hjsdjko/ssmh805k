package com.dao;

import com.entity.DiannaoleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiannaoleixingVO;
import com.entity.view.DiannaoleixingView;


/**
 * 电脑类型
 * 
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
public interface DiannaoleixingDao extends BaseMapper<DiannaoleixingEntity> {
	
	List<DiannaoleixingVO> selectListVO(@Param("ew") Wrapper<DiannaoleixingEntity> wrapper);
	
	DiannaoleixingVO selectVO(@Param("ew") Wrapper<DiannaoleixingEntity> wrapper);
	
	List<DiannaoleixingView> selectListView(@Param("ew") Wrapper<DiannaoleixingEntity> wrapper);

	List<DiannaoleixingView> selectListView(Pagination page,@Param("ew") Wrapper<DiannaoleixingEntity> wrapper);
	
	DiannaoleixingView selectView(@Param("ew") Wrapper<DiannaoleixingEntity> wrapper);
	
}
