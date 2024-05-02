package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiannaofenleiDao;
import com.entity.DiannaofenleiEntity;
import com.service.DiannaofenleiService;
import com.entity.vo.DiannaofenleiVO;
import com.entity.view.DiannaofenleiView;

@Service("diannaofenleiService")
public class DiannaofenleiServiceImpl extends ServiceImpl<DiannaofenleiDao, DiannaofenleiEntity> implements DiannaofenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiannaofenleiEntity> page = this.selectPage(
                new Query<DiannaofenleiEntity>(params).getPage(),
                new EntityWrapper<DiannaofenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiannaofenleiEntity> wrapper) {
		  Page<DiannaofenleiView> page =new Query<DiannaofenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiannaofenleiVO> selectListVO(Wrapper<DiannaofenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiannaofenleiVO selectVO(Wrapper<DiannaofenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiannaofenleiView> selectListView(Wrapper<DiannaofenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiannaofenleiView selectView(Wrapper<DiannaofenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
