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


import com.dao.WailairenkouDao;
import com.entity.WailairenkouEntity;
import com.service.WailairenkouService;
import com.entity.vo.WailairenkouVO;
import com.entity.view.WailairenkouView;

@Service("wailairenkouService")
public class WailairenkouServiceImpl extends ServiceImpl<WailairenkouDao, WailairenkouEntity> implements WailairenkouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WailairenkouEntity> page = this.selectPage(
                new Query<WailairenkouEntity>(params).getPage(),
                new EntityWrapper<WailairenkouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WailairenkouEntity> wrapper) {
		  Page<WailairenkouView> page =new Query<WailairenkouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WailairenkouVO> selectListVO(Wrapper<WailairenkouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WailairenkouVO selectVO(Wrapper<WailairenkouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WailairenkouView> selectListView(Wrapper<WailairenkouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WailairenkouView selectView(Wrapper<WailairenkouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
