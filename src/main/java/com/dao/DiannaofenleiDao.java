package com.dao;

import com.entity.DiannaofenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiannaofenleiVO;
import com.entity.view.DiannaofenleiView;


/**
 * 电脑分类
 * 
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
public interface DiannaofenleiDao extends BaseMapper<DiannaofenleiEntity> {
	
	List<DiannaofenleiVO> selectListVO(@Param("ew") Wrapper<DiannaofenleiEntity> wrapper);
	
	DiannaofenleiVO selectVO(@Param("ew") Wrapper<DiannaofenleiEntity> wrapper);
	
	List<DiannaofenleiView> selectListView(@Param("ew") Wrapper<DiannaofenleiEntity> wrapper);

	List<DiannaofenleiView> selectListView(Pagination page,@Param("ew") Wrapper<DiannaofenleiEntity> wrapper);
	
	DiannaofenleiView selectView(@Param("ew") Wrapper<DiannaofenleiEntity> wrapper);
	
}
