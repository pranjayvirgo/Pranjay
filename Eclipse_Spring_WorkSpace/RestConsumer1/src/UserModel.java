
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class UserModel {

	private String userID;

	private String firstName;

	private String lastName;

	private String password;

	private Date lastLoginTime;

	private String logoutType;

	private Date lastLoggOutTime;

	private String emailID;

	private String Role;

	public UserModel() {

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
