package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiannaopingceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiannaopingceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiannaopingceView;


/**
 * 电脑评测
 *
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
public interface DiannaopingceService extends IService<DiannaopingceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiannaopingceVO> selectListVO(Wrapper<DiannaopingceEntity> wrapper);
   	
   	DiannaopingceVO selectVO(@Param("ew") Wrapper<DiannaopingceEntity> wrapper);
   	
   	List<DiannaopingceView> selectListView(Wrapper<DiannaopingceEntity> wrapper);
   	
   	DiannaopingceView selectView(@Param("ew") Wrapper<DiannaopingceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiannaopingceEntity> wrapper);
   	
}

