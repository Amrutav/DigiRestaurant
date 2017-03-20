package com.liw.dr.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	@Column
	private String userName;
	@Column
	private String userId;
	@Column
	private String email;
	@Column
	private String phone;
	@Column
	private Date lastLoginTime;
	@Column
	private String lastPassword;
	@Column
	private boolean firstLoginFlag;
	@Column
	private boolean activeFlag;
	@Column
	private Date lastPasswordUpdate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getLastPassword() {
		return lastPassword;
	}
	public void setLastPassword(String lastPassword) {
		this.lastPassword = lastPassword;
	}
	public boolean isFirstLoginFlag() {
		return firstLoginFlag;
	}
	public void setFirstLoginFlag(boolean firstLoginFlag) {
		this.firstLoginFlag = firstLoginFlag;
	}
	public boolean isActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
	public Date getLastPasswordUpdate() {
		return lastPasswordUpdate;
	}
	public void setLastPasswordUpdate(Date lastPasswordUpdate) {
		this.lastPasswordUpdate = lastPasswordUpdate;
	}
}
