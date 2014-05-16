package com.pranjay.rest.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pranjay.rest.dao.UserDao;
import com.pranjay.rest.model.UserModel;

/**
 * this class will implement the {@link UserDetailsService} to provide custom
 * authentication provider for user.
 * 
 * @author pranjay
 * 
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {
	/**
	 * to get the {@link UserDao}
	 */
	@Autowired
	private UserDao userDao;
	private final Log logger=LogFactory.getLog(CustomUserDetailsService.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.core.userdetails.UserDetailsService#
	 * loadUserByUsername(java.lang.String)
	 */
	@Transactional
	@Override
	public UserDetails loadUserByUsername(String userID)
			throws UsernameNotFoundException {
		logger.debug("Fetching the user details for Authentication :"+userID);
		UserModel userModel = (UserModel) userDao.fetchExistingUser(userID);
		if(userModel!=null){
		logger.debug("User is present in database setting the user details in user");
		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;
		Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
		grantedAuthorities.add(new SimpleGrantedAuthority(userModel.getRole()));
		UserDetails user = new User(userModel.getUserID(),
				userModel.getPassword(), enabled, accountNonExpired,
				credentialsNonExpired, accountNonLocked, grantedAuthorities);
		return user;
		}
		logger.debug("user is not present in datbase");
		return null;

	}

}
