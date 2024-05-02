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


import com.dao.DiannaopinpaiDao;
import com.entity.DiannaopinpaiEntity;
import com.service.DiannaopinpaiService;
import com.entity.vo.DiannaopinpaiVO;
import com.entity.view.DiannaopinpaiView;

@Service("diannaopinpaiService")
public class DiannaopinpaiServiceImpl extends ServiceImpl<DiannaopinpaiDao, DiannaopinpaiEntity> implements DiannaopinpaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiannaopinpaiEntity> page = this.selectPage(
                new Query<DiannaopinpaiEntity>(params).getPage(),
                new EntityWrapper<DiannaopinpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiannaopinpaiEntity> wrapper) {
		  Page<DiannaopinpaiView> page =new Query<DiannaopinpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiannaopinpaiVO> selectListVO(Wrapper<DiannaopinpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiannaopinpaiVO selectVO(Wrapper<DiannaopinpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiannaopinpaiView> selectListView(Wrapper<DiannaopinpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiannaopinpaiView selectView(Wrapper<DiannaopinpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
