package com.entity.view;

import com.entity.RenkouyisongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 人口移送
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-15 14:52:17
 */
@TableName("renkouyisong")
public class RenkouyisongView  extends RenkouyisongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenkouyisongView(){
	}
 
 	public RenkouyisongView(RenkouyisongEntity renkouyisongEntity){
 	try {
			BeanUtils.copyProperties(this, renkouyisongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
