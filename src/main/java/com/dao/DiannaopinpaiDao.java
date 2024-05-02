package com.dao;

import com.entity.DiannaopinpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiannaopinpaiVO;
import com.entity.view.DiannaopinpaiView;


/**
 * 电脑品牌
 * 
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
public interface DiannaopinpaiDao extends BaseMapper<DiannaopinpaiEntity> {
	
	List<DiannaopinpaiVO> selectListVO(@Param("ew") Wrapper<DiannaopinpaiEntity> wrapper);
	
	DiannaopinpaiVO selectVO(@Param("ew") Wrapper<DiannaopinpaiEntity> wrapper);
	
	List<DiannaopinpaiView> selectListView(@Param("ew") Wrapper<DiannaopinpaiEntity> wrapper);

	List<DiannaopinpaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiannaopinpaiEntity> wrapper);
	
	DiannaopinpaiView selectView(@Param("ew") Wrapper<DiannaopinpaiEntity> wrapper);
	
}
