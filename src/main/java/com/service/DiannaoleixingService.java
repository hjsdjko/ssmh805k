package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiannaoleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiannaoleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiannaoleixingView;


/**
 * 电脑类型
 *
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
public interface DiannaoleixingService extends IService<DiannaoleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiannaoleixingVO> selectListVO(Wrapper<DiannaoleixingEntity> wrapper);
   	
   	DiannaoleixingVO selectVO(@Param("ew") Wrapper<DiannaoleixingEntity> wrapper);
   	
   	List<DiannaoleixingView> selectListView(Wrapper<DiannaoleixingEntity> wrapper);
   	
   	DiannaoleixingView selectView(@Param("ew") Wrapper<DiannaoleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiannaoleixingEntity> wrapper);
   	
}

