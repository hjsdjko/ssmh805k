package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdiannaopingceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdiannaopingceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdiannaopingceView;


/**
 * 电脑评测评论表
 *
 * @author 
 * @email 
 * @date 2021-04-22 14:12:14
 */
public interface DiscussdiannaopingceService extends IService<DiscussdiannaopingceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdiannaopingceVO> selectListVO(Wrapper<DiscussdiannaopingceEntity> wrapper);
   	
   	DiscussdiannaopingceVO selectVO(@Param("ew") Wrapper<DiscussdiannaopingceEntity> wrapper);
   	
   	List<DiscussdiannaopingceView> selectListView(Wrapper<DiscussdiannaopingceEntity> wrapper);
   	
   	DiscussdiannaopingceView selectView(@Param("ew") Wrapper<DiscussdiannaopingceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdiannaopingceEntity> wrapper);
   	
}

