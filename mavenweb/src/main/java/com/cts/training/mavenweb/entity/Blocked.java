package com.cts.training.mavenweb.entity;

import javax.persistence.Column;

public class Blocked {
	public Blocked() {
		
	}
    public Blocked(Integer userId, Integer blockeduserId) {
    	super();
    	this.userId=userId;
    	this.blockeduserId=blockeduserId;
		
	}
    @Column
	private Integer userId;
	@Column
	private Integer blockeduserId;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getBlockeduserId() {
		return blockeduserId;
	}
	public void setBlockeduserId(Integer blockeduserId) {
		this.blockeduserId = blockeduserId;
	}
	@Override
	public String toString() {
		return "Blocked [ userId=" + userId + ", blockeduserId=" + blockeduserId + "]";
		}
}
