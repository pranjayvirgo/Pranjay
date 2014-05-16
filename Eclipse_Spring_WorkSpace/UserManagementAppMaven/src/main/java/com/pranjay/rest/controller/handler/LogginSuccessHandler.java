package com.pranjay.rest.controller.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import com.pranjay.rest.service.UserManagementService;

/**
 * this class is used to record the logging time of user.The last login time is
 * maintained in database and is called on success login
 * 
 * @author pranjay
 * 
 */

public class LogginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
	@Autowired
	private UserManagementService userManageService;
	private final Log logger = LogFactory.getLog(LogginSuccessHandler.class);
/*
 * (non-Javadoc)
 * @see org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler#onAuthenticationSuccess(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.core.Authentication)
 */
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		userManageService.logInTimeStamp(authentication.getName());
logger.info("After updateing Logging Time Redirecting to myhome page");
		setDefaultTargetUrl("/myhome");
		super.onAuthenticationSuccess(request, response, authentication);
	}
}
