package com.pranjay.service;

import java.util.List;

import com.pranjay.model.UserModel;

/**
 * 
 * @author pranjay
 * 
 */
public interface UserManagementService {
	/**
	 * this method will return the list of user based on user input.
	 * 
	 * @param userID
	 * @return list of {@link UserModel}
	 */
	public List<UserModel> searchUser(String userID);

	/**
	 * this method will register the new user
	 * 
	 * @param user
	 * @return
	 */
	public boolean registerUser(UserModel user);

	/**
	 * this method will save the reset password
	 * 
	 * @param user
	 * @param password
	 */
	public void resetPassword(String user, String password);

	/**
	 * this method will save the user login time in database based on user id.
	 * 
	 * @param userId
	 */
	public void logInTimeStamp(String userId);

	/**
	 * this methd will save the user loggout details based on user id.
	 * 
	 * @param userId
	 */
	public void logOutTimeStamp(String userId,String logoutType);

	/**
	 * this method will check the existing user in database during the user
	 * registration and based on that return boolen value.
	 * 
	 * @param userID
	 * @return
	 */
	public boolean checkExistingUser(String userID);
}
