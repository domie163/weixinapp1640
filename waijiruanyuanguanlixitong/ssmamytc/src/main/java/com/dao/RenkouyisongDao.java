package com.dao;

import com.entity.RenkouyisongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenkouyisongVO;
import com.entity.view.RenkouyisongView;


/**
 * 人口移送
 * 
 * @author 
 * @email 
 * @date 2021-03-15 14:52:17
 */
public interface RenkouyisongDao extends BaseMapper<RenkouyisongEntity> {
	
	List<RenkouyisongVO> selectListVO(@Param("ew") Wrapper<RenkouyisongEntity> wrapper);
	
	RenkouyisongVO selectVO(@Param("ew") Wrapper<RenkouyisongEntity> wrapper);
	
	List<RenkouyisongView> selectListView(@Param("ew") Wrapper<RenkouyisongEntity> wrapper);

	List<RenkouyisongView> selectListView(Pagination page,@Param("ew") Wrapper<RenkouyisongEntity> wrapper);
	
	RenkouyisongView selectView(@Param("ew") Wrapper<RenkouyisongEntity> wrapper);
	
}
