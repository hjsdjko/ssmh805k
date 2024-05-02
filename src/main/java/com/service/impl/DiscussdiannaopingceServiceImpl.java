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


import com.dao.DiscussdiannaopingceDao;
import com.entity.DiscussdiannaopingceEntity;
import com.service.DiscussdiannaopingceService;
import com.entity.vo.DiscussdiannaopingceVO;
import com.entity.view.DiscussdiannaopingceView;

@Service("discussdiannaopingceService")
public class DiscussdiannaopingceServiceImpl extends ServiceImpl<DiscussdiannaopingceDao, DiscussdiannaopingceEntity> implements DiscussdiannaopingceService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdiannaopingceEntity> page = this.selectPage(
                new Query<DiscussdiannaopingceEntity>(params).getPage(),
                new EntityWrapper<DiscussdiannaopingceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdiannaopingceEntity> wrapper) {
		  Page<DiscussdiannaopingceView> page =new Query<DiscussdiannaopingceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdiannaopingceVO> selectListVO(Wrapper<DiscussdiannaopingceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdiannaopingceVO selectVO(Wrapper<DiscussdiannaopingceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdiannaopingceView> selectListView(Wrapper<DiscussdiannaopingceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdiannaopingceView selectView(Wrapper<DiscussdiannaopingceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
