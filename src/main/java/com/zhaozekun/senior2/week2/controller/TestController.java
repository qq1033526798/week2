package com.zhaozekun.senior2.week2.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.druid.sql.PagerUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaozekun.senior2.week2.domain.Goods;

@Controller
public class TestController {

	/**
	 * 获取redis
	 */
	@Resource
	RedisTemplate redisTemplate;
	
	@RequestMapping("list")
	public String alla(Model model,@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="10") Integer pageSize
			) {
		PageHelper.startPage(1, pageSize);
		
		/**
		 * 定制Goods类
		 */
		Goods gs = new Goods();
	
		/**
		 * 保存在redis仓库中用list的形式
		 */
		Long list = redisTemplate.opsForList().leftPush("mylist", gs);
		model.addAttribute("list", list);
		return "list";
	}
@RequestMapping("zset")
public String alla2(Model model,@RequestParam(defaultValue="1")Integer page,
		@RequestParam(defaultValue="10") Integer pageSize
		) {
	/**
	 * 用zset的方式保存在redis数据库中
	 */
	HashSet<Goods> good = (HashSet<Goods>) redisTemplate.opsForZSet();
	model.addAttribute("list", good);
	return "zset";
}
}
