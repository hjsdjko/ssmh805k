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


import com.dao.DiannaopingceDao;
import com.entity.DiannaopingceEntity;
import com.service.DiannaopingceService;
import com.entity.vo.DiannaopingceVO;
import com.entity.view.DiannaopingceView;

@Service("diannaopingceService")
public class DiannaopingceServiceImpl extends ServiceImpl<DiannaopingceDao, DiannaopingceEntity> implements DiannaopingceService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiannaopingceEntity> page = this.selectPage(
                new Query<DiannaopingceEntity>(params).getPage(),
                new EntityWrapper<DiannaopingceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiannaopingceEntity> wrapper) {
		  Page<DiannaopingceView> page =new Query<DiannaopingceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiannaopingceVO> selectListVO(Wrapper<DiannaopingceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiannaopingceVO selectVO(Wrapper<DiannaopingceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiannaopingceView> selectListView(Wrapper<DiannaopingceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiannaopingceView selectView(Wrapper<DiannaopingceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
