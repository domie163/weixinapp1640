package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WailairenkouEntity;
import com.entity.view.WailairenkouView;

import com.service.WailairenkouService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 外来人口
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-15 14:52:17
 */
@RestController
@RequestMapping("/wailairenkou")
public class WailairenkouController {
    @Autowired
    private WailairenkouService wailairenkouService;
    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		WailairenkouEntity user = wailairenkouService.selectOne(new EntityWrapper<WailairenkouEntity>().eq("shenfenzhenghao", username));
		if(user==null || !user.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		if("否".equals(user.getSfsh())) return R.error("账号已锁定，请联系管理员审核。");
		String token = tokenService.generateToken(user.getId(), username,"wailairenkou",  "外来人口" );
		return R.ok().put("token", token);
	}
	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody WailairenkouEntity wailairenkou){
    	//ValidatorUtils.validateEntity(wailairenkou);
    	WailairenkouEntity user = wailairenkouService.selectOne(new EntityWrapper<WailairenkouEntity>().eq("shenfenzhenghao", wailairenkou.getShenfenzhenghao()));
		if(user!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		wailairenkou.setId(uId);
        wailairenkouService.insert(wailairenkou);
        return R.ok();
    }
	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        WailairenkouEntity user = wailairenkouService.selectById(id);
        return R.ok().put("data", user);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	WailairenkouEntity user = wailairenkouService.selectOne(new EntityWrapper<WailairenkouEntity>().eq("shenfenzhenghao", username));
    	if(user==null) {
    		return R.error("账号不存在");
    	}
    	user.setMima("123456");
        wailairenkouService.updateById(user);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WailairenkouEntity wailairenkou, 
		HttpServletRequest request){

        EntityWrapper<WailairenkouEntity> ew = new EntityWrapper<WailairenkouEntity>();
		PageUtils page = wailairenkouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wailairenkou), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WailairenkouEntity wailairenkou, HttpServletRequest request){
        EntityWrapper<WailairenkouEntity> ew = new EntityWrapper<WailairenkouEntity>();
		PageUtils page = wailairenkouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wailairenkou), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WailairenkouEntity wailairenkou){
       	EntityWrapper<WailairenkouEntity> ew = new EntityWrapper<WailairenkouEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wailairenkou, "wailairenkou")); 
        return R.ok().put("data", wailairenkouService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WailairenkouEntity wailairenkou){
        EntityWrapper< WailairenkouEntity> ew = new EntityWrapper< WailairenkouEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wailairenkou, "wailairenkou")); 
		WailairenkouView wailairenkouView =  wailairenkouService.selectView(ew);
		return R.ok("查询外来人口成功").put("data", wailairenkouView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WailairenkouEntity wailairenkou = wailairenkouService.selectById(id);
        return R.ok().put("data", wailairenkou);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WailairenkouEntity wailairenkou = wailairenkouService.selectById(id);
        return R.ok().put("data", wailairenkou);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WailairenkouEntity wailairenkou, HttpServletRequest request){
    	wailairenkou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wailairenkou);
    	WailairenkouEntity user = wailairenkouService.selectOne(new EntityWrapper<WailairenkouEntity>().eq("shenfenzhenghao", wailairenkou.getShenfenzhenghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}

		wailairenkou.setId(new Date().getTime());
        wailairenkouService.insert(wailairenkou);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WailairenkouEntity wailairenkou, HttpServletRequest request){
    	wailairenkou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wailairenkou);
    	WailairenkouEntity user = wailairenkouService.selectOne(new EntityWrapper<WailairenkouEntity>().eq("shenfenzhenghao", wailairenkou.getShenfenzhenghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}

		wailairenkou.setId(new Date().getTime());
        wailairenkouService.insert(wailairenkou);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WailairenkouEntity wailairenkou, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wailairenkou);
        wailairenkouService.updateById(wailairenkou);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wailairenkouService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WailairenkouEntity> wrapper = new EntityWrapper<WailairenkouEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = wailairenkouService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
