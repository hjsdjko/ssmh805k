package com.dao;

import com.entity.DiscussdiannaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdiannaoxinxiVO;
import com.entity.view.DiscussdiannaoxinxiView;


/**
 * 电脑信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-22 14:12:14
 */
public interface DiscussdiannaoxinxiDao extends BaseMapper<DiscussdiannaoxinxiEntity> {
	
	List<DiscussdiannaoxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussdiannaoxinxiEntity> wrapper);
	
	DiscussdiannaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussdiannaoxinxiEntity> wrapper);
	
	List<DiscussdiannaoxinxiView> selectListView(@Param("ew") Wrapper<DiscussdiannaoxinxiEntity> wrapper);

	List<DiscussdiannaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdiannaoxinxiEntity> wrapper);
	
	DiscussdiannaoxinxiView selectView(@Param("ew") Wrapper<DiscussdiannaoxinxiEntity> wrapper);
	
}
