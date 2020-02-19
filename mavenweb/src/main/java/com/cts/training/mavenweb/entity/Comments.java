package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private Integer userId;
	@Column
	private  Integer mediaId;
	@Column
	private String comment;
	@Column
	@CreationTimestamp
	 private LocalDateTime createdOn;
	public Comments() {
		
	}
	public Comments(Integer id, Integer userId,Integer mediaId,String comment,LocalDateTime createdOn) {
		super();
		this.id = id;
		this.userId = userId;
		this.mediaId=mediaId;
		this.comment=comment;
		this.createdOn=createdOn;
				
		}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getMediaId() {
		return mediaId;
	}
	public void setMediaId(Integer mediaId) {
		this.mediaId = mediaId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public String toString() {
		return "Comments [id=" + id + ", userId=" + userId + ", mediaId=" +mediaId +",comment="+ comment +", createdOn=" + createdOn + "]";
		}

}
