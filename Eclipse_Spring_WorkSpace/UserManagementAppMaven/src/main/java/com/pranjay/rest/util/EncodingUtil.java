package com.pranjay.rest.util;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;


/**
 * this the utility class to encrypt password,getting security context and
 * getting current user.
 * 
 * @author pranjay
 * 
 */
public class EncodingUtil {
	/**
	 * this method will return the encrypted password using md5 and username
	 * property as salt.
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	public static String encryptPassword(String userName, String password) {

		return ((Md5PasswordEncoder) org.springframework.web.context.ContextLoaderListener
				.getCurrentWebApplicationContext().getBean("passwordEncoder"))
				.encodePassword(password, userName);

	}

	/**
	 * this method will return the current user logged in from sping security
	 * context.
	 * 
	 * @return
	 */
	public static User getCurrentUser() {
		User user = (User) getSecurityContext().getAuthentication()
				.getPrincipal();
		return user;
	}

	/**
	 * this method will return the current security context.
	 * 
	 * @return
	 */
	public static SecurityContext getSecurityContext() {
		return SecurityContextHolder.getContext();
	}
}
