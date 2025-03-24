package com.dao;

import com.entity.WailairenkouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WailairenkouVO;
import com.entity.view.WailairenkouView;


/**
 * 外来人口
 * 
 * @author 
 * @email 
 * @date 2021-03-15 14:52:17
 */
public interface WailairenkouDao extends BaseMapper<WailairenkouEntity> {
	
	List<WailairenkouVO> selectListVO(@Param("ew") Wrapper<WailairenkouEntity> wrapper);
	
	WailairenkouVO selectVO(@Param("ew") Wrapper<WailairenkouEntity> wrapper);
	
	List<WailairenkouView> selectListView(@Param("ew") Wrapper<WailairenkouEntity> wrapper);

	List<WailairenkouView> selectListView(Pagination page,@Param("ew") Wrapper<WailairenkouEntity> wrapper);
	
	WailairenkouView selectView(@Param("ew") Wrapper<WailairenkouEntity> wrapper);
	
}
