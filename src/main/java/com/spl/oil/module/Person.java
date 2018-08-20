package com.spl.oil.module;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private int age;
	private String name;
	
	private Address address;
	private Sex sex;
	
	
	
	public Person(Long id, int age, String name, Address address, Sex sex) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
		this.sex = sex;
	}
	public Long getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public Sex getSex() {
		return sex;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
	
	@Override
	public String toString() {
	
		return  this.getId()+":"+this.getName()+":"+
		this.getName()+":"+this.getSex()+":"+
				this.getAddress();
	}
	
	
}
