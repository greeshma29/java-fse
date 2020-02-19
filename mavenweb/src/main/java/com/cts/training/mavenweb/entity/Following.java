package com.cts.training.mavenweb.entity;

import javax.persistence.Column;

public class Following {
public Following() {
		
	}
    public Following(Integer userId, Integer followerId) {
    	super();
    	this.userId=userId;
    	this.followerId=followerId;
		
	}
    @Column
	private Integer userId;
	@Column
	private Integer followerId;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getFollowerId() {
		return followerId;
	}
	public void setFollowerId(Integer followerId) {
		this.followerId = followerId;
	}

	@Override
	public String toString() {
		return "Following [ userId=" + userId + ", followerId=" + followerId + "]";
		}
}
