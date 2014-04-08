package com.pranjay.dao;

import java.util.List;

import com.pranjay.model.UserModel;
/**
 * this class defines the contract for interacting with database.
 * @author pranjay
 *
 */
public interface UserDao {

/**
 * this method will save the user login time in database based on user id.
 * @param userName
 */

public void saveLoginDetails(String userName);
/**
 * this methd will save the user loggout details based on user id.
 * @param userName
 */
public void saveLoggoutDetails(String userName,String logoutType);
/**
 * 
 * @param user
 */
public void saveUserDetails(UserModel user);
/**
 * this method will fetch the user details.
 * @param userID
 * @return
 */
public Object fetchExistingUser(String userID);
/**
 * this method will return the list of user based on user input.
 * @param userID
 * @return
 *       list of{@link UserModel}
 */
public List<UserModel> searchUser(String userID);
/**
 * this method will save the new password in database
 * @param user
 * @param password
 */
public void resetPassword(String user,String password);

}
