package com.spl.oil.module;

import java.io.Serializable;

public class Sex implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Sex(String sex) {
		super();
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		
		return   "["+this.getSex()+"]";
	}
	
	
}
