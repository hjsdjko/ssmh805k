package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiannaofenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiannaofenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiannaofenleiView;


/**
 * 电脑分类
 *
 * @author 
 * @email 
 * @date 2021-04-22 14:12:13
 */
public interface DiannaofenleiService extends IService<DiannaofenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiannaofenleiVO> selectListVO(Wrapper<DiannaofenleiEntity> wrapper);
   	
   	DiannaofenleiVO selectVO(@Param("ew") Wrapper<DiannaofenleiEntity> wrapper);
   	
   	List<DiannaofenleiView> selectListView(Wrapper<DiannaofenleiEntity> wrapper);
   	
   	DiannaofenleiView selectView(@Param("ew") Wrapper<DiannaofenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiannaofenleiEntity> wrapper);
   	
}

