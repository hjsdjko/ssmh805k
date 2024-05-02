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


import com.dao.DiscussdiannaopinpaiDao;
import com.entity.DiscussdiannaopinpaiEntity;
import com.service.DiscussdiannaopinpaiService;
import com.entity.vo.DiscussdiannaopinpaiVO;
import com.entity.view.DiscussdiannaopinpaiView;

@Service("discussdiannaopinpaiService")
public class DiscussdiannaopinpaiServiceImpl extends ServiceImpl<DiscussdiannaopinpaiDao, DiscussdiannaopinpaiEntity> implements DiscussdiannaopinpaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdiannaopinpaiEntity> page = this.selectPage(
                new Query<DiscussdiannaopinpaiEntity>(params).getPage(),
                new EntityWrapper<DiscussdiannaopinpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdiannaopinpaiEntity> wrapper) {
		  Page<DiscussdiannaopinpaiView> page =new Query<DiscussdiannaopinpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdiannaopinpaiVO> selectListVO(Wrapper<DiscussdiannaopinpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdiannaopinpaiVO selectVO(Wrapper<DiscussdiannaopinpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdiannaopinpaiView> selectListView(Wrapper<DiscussdiannaopinpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdiannaopinpaiView selectView(Wrapper<DiscussdiannaopinpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
