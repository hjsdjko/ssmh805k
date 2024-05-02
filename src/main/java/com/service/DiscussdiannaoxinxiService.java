package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdiannaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdiannaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdiannaoxinxiView;


/**
 * 电脑信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-22 14:12:14
 */
public interface DiscussdiannaoxinxiService extends IService<DiscussdiannaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdiannaoxinxiVO> selectListVO(Wrapper<DiscussdiannaoxinxiEntity> wrapper);
   	
   	DiscussdiannaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussdiannaoxinxiEntity> wrapper);
   	
   	List<DiscussdiannaoxinxiView> selectListView(Wrapper<DiscussdiannaoxinxiEntity> wrapper);
   	
   	DiscussdiannaoxinxiView selectView(@Param("ew") Wrapper<DiscussdiannaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdiannaoxinxiEntity> wrapper);
   	
}

