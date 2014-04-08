package com.pranjay.dao.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pranjay.controller.UserController;
import com.pranjay.dao.UserDao;
import com.pranjay.model.UserModel;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	private final Log logger = LogFactory.getLog(UserDaoImpl.class);


	@Override
	public void saveUserDetails(UserModel user) {
		sessionFactory.getCurrentSession().save(user);

	}

	@Override
	public void saveLoginDetails(String userID) {
		UserModel userModel = (UserModel) sessionFactory.getCurrentSession()
				.get(UserModel.class, userID);
		userModel.setLastLoginTime(new Date());
		try{
		sessionFactory.getCurrentSession().save(userModel);
		}
		catch(HibernateException e){
			logger.error("Getting error while saving Loging time for user :"+userID, e);
		}
		logger.debug("successfully saved the logintime for user :"+userID);
	}

	@Override
	public void saveLoggoutDetails(String userID,String logoutType) {
		try{
		UserModel userModel = (UserModel) sessionFactory.getCurrentSession()
				.get(UserModel.class, userID);
		userModel.setLastLoggOutTime(new Date());
		userModel.setLogoutType(logoutType);
		sessionFactory.getCurrentSession().save(userModel);
		logger.debug("successfully saved the loggout time for user :"+userID);
		}catch (HibernateException e) {
			logger.error("Getting error while saving Loggout time for user :"+userID, e);
		}
	}

	@Override
	public Object fetchExistingUser(String userID) {
		Object user=null;
		try{
			user=sessionFactory.getCurrentSession().get(UserModel.class, userID);
		 
		}catch (HibernateException e) {
			logger.error("Getting error while fetching existing user :"+userID, e);
		}
		return user;
	}

	@Override
	public List<UserModel> searchUser(String userID) {
		List<UserModel> userList=null;
		try{
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from UserModel u where u.userID like :userID");

	 userList = query.setParameter("userID","%"+userID + "%")
				.list();
		logger.debug("successfully fetched the list of users :"+userID);
		}catch (HibernateException e) {
			logger.error("Getting error while searching for user :"+userID, e);
		}
		return userList;
	}

	@Override
	public void resetPassword(String userID, String password) {
		try{
		UserModel userModel = (UserModel) sessionFactory.getCurrentSession()
		.get(UserModel.class, userID);
		
		userModel.setPassword(password);
		sessionFactory.getCurrentSession().save(userModel);
		logger.debug("successfully saved the new password for user :"+userID);
		}catch (HibernateException e) {
			logger.error("Getting Error while saving the new password");
		}
	}

}
