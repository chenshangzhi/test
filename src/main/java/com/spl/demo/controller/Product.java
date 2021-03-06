package com.spl.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spl.oil.module.Address;
import com.spl.oil.module.Person;
import com.spl.oil.module.Sex;

@RestController
@EnableTransactionManagement
public class Product {

	///发发发反反复复

	@Autowired
	DataSource ds;
 
	@RequestMapping("/list")
	public List<Person> list(){
		try{
		System.out.println(ds.getConnection().prepareStatement("select * from toi_oil").executeQuery());
		}catch(Exception exx){}
		
		List<Person> list=new ArrayList<Person>();
		
		list.add(new Person(1L, 5, "小张", new Address(10L,"北京",new Sex("man")),new Sex("男人")));
		list.add(new Person(2L, 10, "小再", new Address(20L,"上海",new Sex("boy")),new Sex("男孩")));
		list.add(new Person(3L, 15, "小到", new Address(30L,"天津",new Sex("young")),new Sex("青年")));
		return  list;
	}
	

	 
	
	
}
