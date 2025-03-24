package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenkouyisongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenkouyisongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenkouyisongView;


/**
 * 人口移送
 *
 * @author 
 * @email 
 * @date 2021-03-15 14:52:17
 */
public interface RenkouyisongService extends IService<RenkouyisongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenkouyisongVO> selectListVO(Wrapper<RenkouyisongEntity> wrapper);
   	
   	RenkouyisongVO selectVO(@Param("ew") Wrapper<RenkouyisongEntity> wrapper);
   	
   	List<RenkouyisongView> selectListView(Wrapper<RenkouyisongEntity> wrapper);
   	
   	RenkouyisongView selectView(@Param("ew") Wrapper<RenkouyisongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenkouyisongEntity> wrapper);
   	
}

