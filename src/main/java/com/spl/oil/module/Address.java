package com.spl.oil.module;



public class Address {
	
	private Long id;
	private String add;
	
	
	private Sex sex;


	public Long getId() {
		return id;
	}


	public String getAdd() {
		return add;
	}


	public Sex getSex() {
		return sex;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setAdd(String add) {
		this.add = add;
	}


	public void setSex(Sex sex) {
		this.sex = sex;
	}


	public Address(Long id, String add, Sex sex) {
		super();
		this.id = id;
		this.add = add;
		this.sex = sex;
	}
	
	
	@Override
	public String toString() {
		
		return  this.getId()+"-"+this.getAdd()+"-"+this.getSex();
	}
	
	

}
