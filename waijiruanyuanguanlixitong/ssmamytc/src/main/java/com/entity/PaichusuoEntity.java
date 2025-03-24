package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 派出所
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-15 14:52:17
 */
@TableName("paichusuo")
public class PaichusuoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PaichusuoEntity() {
		
	}
	
	public PaichusuoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 派出所名称
	 */
					
	private String paichusuomingcheng;
	
	/**
	 * 负责人
	 */
					
	private String fuzeren;
	
	/**
	 * 电话
	 */
					
	private String dianhua;
	
	/**
	 * 邮箱
	 */
					
	private String youxiang;
	
	/**
	 * 地址
	 */
					
	private String dizhi;
	
	/**
	 * 网址
	 */
					
	private String wangzhi;
	
	/**
	 * 服务时间
	 */
					
	private String fuwushijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：派出所名称
	 */
	public void setPaichusuomingcheng(String paichusuomingcheng) {
		this.paichusuomingcheng = paichusuomingcheng;
	}
	/**
	 * 获取：派出所名称
	 */
	public String getPaichusuomingcheng() {
		return paichusuomingcheng;
	}
	/**
	 * 设置：负责人
	 */
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
	/**
	 * 设置：电话
	 */
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
	}
	/**
	 * 设置：邮箱
	 */
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
	/**
	 * 设置：地址
	 */
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
	/**
	 * 设置：网址
	 */
	public void setWangzhi(String wangzhi) {
		this.wangzhi = wangzhi;
	}
	/**
	 * 获取：网址
	 */
	public String getWangzhi() {
		return wangzhi;
	}
	/**
	 * 设置：服务时间
	 */
	public void setFuwushijian(String fuwushijian) {
		this.fuwushijian = fuwushijian;
	}
	/**
	 * 获取：服务时间
	 */
	public String getFuwushijian() {
		return fuwushijian;
	}

}
