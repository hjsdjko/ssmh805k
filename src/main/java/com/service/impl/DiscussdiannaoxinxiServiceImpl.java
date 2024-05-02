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


import com.dao.DiscussdiannaoxinxiDao;
import com.entity.DiscussdiannaoxinxiEntity;
import com.service.DiscussdiannaoxinxiService;
import com.entity.vo.DiscussdiannaoxinxiVO;
import com.entity.view.DiscussdiannaoxinxiView;

@Service("discussdiannaoxinxiService")
public class DiscussdiannaoxinxiServiceImpl extends ServiceImpl<DiscussdiannaoxinxiDao, DiscussdiannaoxinxiEntity> implements DiscussdiannaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdiannaoxinxiEntity> page = this.selectPage(
                new Query<DiscussdiannaoxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussdiannaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdiannaoxinxiEntity> wrapper) {
		  Page<DiscussdiannaoxinxiView> page =new Query<DiscussdiannaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdiannaoxinxiVO> selectListVO(Wrapper<DiscussdiannaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdiannaoxinxiVO selectVO(Wrapper<DiscussdiannaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdiannaoxinxiView> selectListView(Wrapper<DiscussdiannaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdiannaoxinxiView selectView(Wrapper<DiscussdiannaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
