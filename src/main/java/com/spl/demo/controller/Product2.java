package com.spl.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/")
public class Product2 {

	
	@RequestMapping("/a")
    public String a(HttpServletRequest re,HttpServletResponse res,ModelMap model){
	System.out.println(re);
	System.out.println(res);
	
	model.addAttribute("a","当前时间："+System.currentTimeMillis());
        return "a";
    }
	
	
	@RequestMapping("/b")
	@ResponseBody
    public  String b(HttpServletRequest re,HttpServletResponse res,ModelMap model){
		return "这个是测试的:"+System.currentTimeMillis();
    }
}
