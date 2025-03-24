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


import com.dao.RenkouyisongDao;
import com.entity.RenkouyisongEntity;
import com.service.RenkouyisongService;
import com.entity.vo.RenkouyisongVO;
import com.entity.view.RenkouyisongView;

@Service("renkouyisongService")
public class RenkouyisongServiceImpl extends ServiceImpl<RenkouyisongDao, RenkouyisongEntity> implements RenkouyisongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenkouyisongEntity> page = this.selectPage(
                new Query<RenkouyisongEntity>(params).getPage(),
                new EntityWrapper<RenkouyisongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenkouyisongEntity> wrapper) {
		  Page<RenkouyisongView> page =new Query<RenkouyisongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenkouyisongVO> selectListVO(Wrapper<RenkouyisongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenkouyisongVO selectVO(Wrapper<RenkouyisongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenkouyisongView> selectListView(Wrapper<RenkouyisongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenkouyisongView selectView(Wrapper<RenkouyisongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
