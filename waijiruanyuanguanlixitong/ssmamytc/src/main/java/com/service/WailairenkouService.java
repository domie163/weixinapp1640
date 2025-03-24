package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WailairenkouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WailairenkouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WailairenkouView;


/**
 * 外来人口
 *
 * @author 
 * @email 
 * @date 2021-03-15 14:52:17
 */
public interface WailairenkouService extends IService<WailairenkouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WailairenkouVO> selectListVO(Wrapper<WailairenkouEntity> wrapper);
   	
   	WailairenkouVO selectVO(@Param("ew") Wrapper<WailairenkouEntity> wrapper);
   	
   	List<WailairenkouView> selectListView(Wrapper<WailairenkouEntity> wrapper);
   	
   	WailairenkouView selectView(@Param("ew") Wrapper<WailairenkouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WailairenkouEntity> wrapper);
   	
}

