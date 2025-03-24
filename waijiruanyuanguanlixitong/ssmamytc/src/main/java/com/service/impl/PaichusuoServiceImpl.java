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


import com.dao.PaichusuoDao;
import com.entity.PaichusuoEntity;
import com.service.PaichusuoService;
import com.entity.vo.PaichusuoVO;
import com.entity.view.PaichusuoView;

@Service("paichusuoService")
public class PaichusuoServiceImpl extends ServiceImpl<PaichusuoDao, PaichusuoEntity> implements PaichusuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PaichusuoEntity> page = this.selectPage(
                new Query<PaichusuoEntity>(params).getPage(),
                new EntityWrapper<PaichusuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PaichusuoEntity> wrapper) {
		  Page<PaichusuoView> page =new Query<PaichusuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PaichusuoVO> selectListVO(Wrapper<PaichusuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PaichusuoVO selectVO(Wrapper<PaichusuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PaichusuoView> selectListView(Wrapper<PaichusuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PaichusuoView selectView(Wrapper<PaichusuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
