package com.dao;

import com.entity.PaichusuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PaichusuoVO;
import com.entity.view.PaichusuoView;


/**
 * 派出所
 * 
 * @author 
 * @email 
 * @date 2021-03-15 14:52:17
 */
public interface PaichusuoDao extends BaseMapper<PaichusuoEntity> {
	
	List<PaichusuoVO> selectListVO(@Param("ew") Wrapper<PaichusuoEntity> wrapper);
	
	PaichusuoVO selectVO(@Param("ew") Wrapper<PaichusuoEntity> wrapper);
	
	List<PaichusuoView> selectListView(@Param("ew") Wrapper<PaichusuoEntity> wrapper);

	List<PaichusuoView> selectListView(Pagination page,@Param("ew") Wrapper<PaichusuoEntity> wrapper);
	
	PaichusuoView selectView(@Param("ew") Wrapper<PaichusuoEntity> wrapper);
	
}
