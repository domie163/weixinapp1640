package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PaichusuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PaichusuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PaichusuoView;


/**
 * 派出所
 *
 * @author 
 * @email 
 * @date 2021-03-15 14:52:17
 */
public interface PaichusuoService extends IService<PaichusuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PaichusuoVO> selectListVO(Wrapper<PaichusuoEntity> wrapper);
   	
   	PaichusuoVO selectVO(@Param("ew") Wrapper<PaichusuoEntity> wrapper);
   	
   	List<PaichusuoView> selectListView(Wrapper<PaichusuoEntity> wrapper);
   	
   	PaichusuoView selectView(@Param("ew") Wrapper<PaichusuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PaichusuoEntity> wrapper);
   	
}

