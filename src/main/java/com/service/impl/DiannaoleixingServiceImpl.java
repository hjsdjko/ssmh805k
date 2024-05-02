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


import com.dao.DiannaoleixingDao;
import com.entity.DiannaoleixingEntity;
import com.service.DiannaoleixingService;
import com.entity.vo.DiannaoleixingVO;
import com.entity.view.DiannaoleixingView;

@Service("diannaoleixingService")
public class DiannaoleixingServiceImpl extends ServiceImpl<DiannaoleixingDao, DiannaoleixingEntity> implements DiannaoleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiannaoleixingEntity> page = this.selectPage(
                new Query<DiannaoleixingEntity>(params).getPage(),
                new EntityWrapper<DiannaoleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiannaoleixingEntity> wrapper) {
		  Page<DiannaoleixingView> page =new Query<DiannaoleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiannaoleixingVO> selectListVO(Wrapper<DiannaoleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiannaoleixingVO selectVO(Wrapper<DiannaoleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiannaoleixingView> selectListView(Wrapper<DiannaoleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiannaoleixingView selectView(Wrapper<DiannaoleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
