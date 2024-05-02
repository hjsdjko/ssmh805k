package com.dao;

import com.entity.DiscussdiannaopinpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdiannaopinpaiVO;
import com.entity.view.DiscussdiannaopinpaiView;


/**
 * 电脑品牌评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-22 14:12:14
 */
public interface DiscussdiannaopinpaiDao extends BaseMapper<DiscussdiannaopinpaiEntity> {
	
	List<DiscussdiannaopinpaiVO> selectListVO(@Param("ew") Wrapper<DiscussdiannaopinpaiEntity> wrapper);
	
	DiscussdiannaopinpaiVO selectVO(@Param("ew") Wrapper<DiscussdiannaopinpaiEntity> wrapper);
	
	List<DiscussdiannaopinpaiView> selectListView(@Param("ew") Wrapper<DiscussdiannaopinpaiEntity> wrapper);

	List<DiscussdiannaopinpaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdiannaopinpaiEntity> wrapper);
	
	DiscussdiannaopinpaiView selectView(@Param("ew") Wrapper<DiscussdiannaopinpaiEntity> wrapper);
	
}
