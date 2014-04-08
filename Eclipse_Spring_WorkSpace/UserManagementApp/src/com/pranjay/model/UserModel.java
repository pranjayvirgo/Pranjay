package com.pranjay.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Users")
public class UserModel {
	@Column(name = "USERID")
	@Id
	private String userID;
	@Column(name = "FIRSTNAME")
	private String firstName;
	@Column(name = "LASTNAME")
	private String lastName;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "LASTLOGINTIME")
	private Date lastLoginTime;
	@Column(name = "LOGOUTTYPE")
	private String logoutType;
	@Column(name = "LASTLOGGOUTTIME")
	private Date lastLoggOutTime;
	@Column(name="EMAILID")
	private String emailID;
	@Column(name="ROLE")
	private String Role;
public UserModel(){
	
}
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getLastLoggOutTime() {
		return lastLoggOutTime;
	}

	public void setLastLoggOutTime(Date lastLoggOutTime) {
		this.lastLoggOutTime = lastLoggOutTime;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getLogoutType() {
		return logoutType;
	}
	public void setLogoutType(String logoutType) {
		this.logoutType = logoutType;
	}

}
