package com.app.pojo;

import java.sql.Timestamp;
import java.time.Instant;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class BasePojo {

	private Integer	 	createUserId;
	private Integer 	updateUserId;
	private Integer 	deleteUserId;
	private Timestamp 	createTimeStamp;
	private Timestamp	updateTimeStamp;
	private Timestamp	deleteTimeStamp;
	
	public Integer getCreateUserId() {
		return createUserId;
	}
	
	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}
	
	public Integer getUpdateUserId() {
		return updateUserId;
	}
	
	public void setUpdateUserId(Integer updateUserId) {
		this.updateUserId = updateUserId;
	}
	
	public Integer getDeleteUserId() {
		return deleteUserId;
	}
	
	public void setDeleteUserId(Integer deleteUserId) {
		this.deleteUserId = deleteUserId;
	}
	
	public Timestamp getCreateTimeStamp() {
		return createTimeStamp;
	}
	
	@PrePersist
	public void setCreateTimeStamp() {
		this.createTimeStamp = Timestamp.from(Instant.now());
	}
	
	public Timestamp getUpdateTimeStamp() {
		return updateTimeStamp;
	}
	
	@PreUpdate
	public void setUpdateTimeStamp() {
		this.updateTimeStamp = Timestamp.from(Instant.now());
	}
	
	public Timestamp getDeleteTimeStamp() {
		return deleteTimeStamp;
	}
	
	//@PreUpdate : we can not set more than one method as callback method
	public void setDeleteTimeStamp() {
		this.deleteTimeStamp = Timestamp.from(Instant.now());
	}
}