package com.spl.oil.module;

import java.util.List;

public class Department {
	
	/**
	 * 状态：有效
	 */
	public static String STATUS_EFFECTIVE = "有效";
	
	/**
	 * 状态：无效
	 */
	public static String STATUS_INVALID = "无效";
	
	private long id;					//主键id
	private String name;				//部门名称
	private String dataCode;			//部门标识
	private String status;				//状态
	private long parentId;			//上级部门id
	private String createTime;			//创建时间
	private String prefix;				//前缀
	private String manageArea;			//管理区域
	private int levelId;			//等级id(数据字典中对应id)
	private String state;				//状态前端tree展开(open)或者折叠(closed)
	
	private List<Department> children;	//子级部门
	private String parentName;
	
	//统计字段不计入数据库
	private String faceCount;			//面审
	private String contractCount;		//合同
	private String pass;				//过件率
	private String average;				//件均
	private String averagePoint;		//平均成数
	private String firstPoint;			//先息占比
	private String bothPoint;			//等额占比
	private String fallBack;			//兜底
	private String fallBackPoint;		//兜底率
	private String charge;				//主管审批
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	
	public String getFaceCount() {
		return faceCount;
	}

	public void setFaceCount(String faceCount) {
		this.faceCount = faceCount;
	}

	public String getContractCount() {
		return contractCount;
	}

	public void setContractCount(String contractCount) {
		this.contractCount = contractCount;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAverage() {
		return average;
	}

	public void setAverage(String average) {
		this.average = average;
	}

	public String getAveragePoint() {
		return averagePoint;
	}

	public void setAveragePoint(String averagePoint) {
		this.averagePoint = averagePoint;
	}

	public String getFirstPoint() {
		return firstPoint;
	}

	public void setFirstPoint(String firstPoint) {
		this.firstPoint = firstPoint;
	}

	public String getBothPoint() {
		return bothPoint;
	}

	public void setBothPoint(String bothPoint) {
		this.bothPoint = bothPoint;
	}

	public String getFallBack() {
		return fallBack;
	}

	public void setFallBack(String fallBack) {
		this.fallBack = fallBack;
	}

	public String getFallBackPoint() {
		return fallBackPoint;
	}

	public void setFallBackPoint(String fallBackPoint) {
		this.fallBackPoint = fallBackPoint;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDataCode() {
		return dataCode;
	}

	public void setDataCode(String dataCode) {
		this.dataCode = dataCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getManageArea() {
		return manageArea;
	}

	public void setManageArea(String manageArea) {
		this.manageArea = manageArea;
	}

	public int getLevelId() {
		return levelId;
	}

	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Department> getChildren() {
		return children;
	}

	public void setChildren(List<Department> children) {
		this.children = children;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
}
