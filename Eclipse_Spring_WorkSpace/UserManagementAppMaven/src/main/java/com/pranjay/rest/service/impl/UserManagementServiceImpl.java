package com.pranjay.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pranjay.rest.dao.UserDao;
import com.pranjay.rest.model.UserModel;
import com.pranjay.rest.service.UserManagementService;

@Service
public class UserManagementServiceImpl implements UserManagementService {
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public List<UserModel> searchUser(String userID) {
		return userDao.searchUser(userID);

	}

	@Override
	@Transactional
	public boolean registerUser(UserModel user) {
		userDao.saveUserDetails(user);
		return true;
	}

	@Override
	@Transactional
	public void resetPassword(String user,String password) {
		userDao.resetPassword(user, password);

	}

	@Override
	@Transactional
	public void logInTimeStamp(String userName) {
		userDao.saveLoginDetails(userName);

	}

	@Override
	@Transactional
	public void logOutTimeStamp(String userName,String logoutType) {
		userDao.saveLoggoutDetails(userName,logoutType);

	}

	@Override
	@Transactional
	public boolean checkExistingUser(String userID) {
		Object user = userDao.fetchExistingUser(userID);
		if (user != null) {
			return true;
		}
		return false;
	}

}
