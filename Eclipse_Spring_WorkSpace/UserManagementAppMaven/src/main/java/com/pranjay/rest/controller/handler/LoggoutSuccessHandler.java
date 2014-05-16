package com.pranjay.rest.controller.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

import com.pranjay.rest.service.UserManagementService;


	public class LoggoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {
		@Autowired
		private UserManagementService userManageService;

		@Override
		public void onLogoutSuccess(HttpServletRequest request,
				HttpServletResponse response, Authentication authentication)
				throws IOException, ServletException {

			if (authentication != null) {
				HttpSession currentSession=request.getSession();
				currentSession.setAttribute("manual_logout","manuallogout");
				userManageService.logOutTimeStamp(authentication.getName(),"MANUAL");
			}

			setDefaultTargetUrl("/home");
			super.onLogoutSuccess(request, response, authentication);
		}
	}
