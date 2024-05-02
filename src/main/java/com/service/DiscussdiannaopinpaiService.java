package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdiannaopinpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdiannaopinpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdiannaopinpaiView;


/**
 * 电脑品牌评论表
 *
 * @author 
 * @email 
 * @date 2021-04-22 14:12:14
 */
public interface DiscussdiannaopinpaiService extends IService<DiscussdiannaopinpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdiannaopinpaiVO> selectListVO(Wrapper<DiscussdiannaopinpaiEntity> wrapper);
   	
   	DiscussdiannaopinpaiVO selectVO(@Param("ew") Wrapper<DiscussdiannaopinpaiEntity> wrapper);
   	
   	List<DiscussdiannaopinpaiView> selectListView(Wrapper<DiscussdiannaopinpaiEntity> wrapper);
   	
   	DiscussdiannaopinpaiView selectView(@Param("ew") Wrapper<DiscussdiannaopinpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdiannaopinpaiEntity> wrapper);
   	
}

