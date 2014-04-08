package com.pranjay.controller.handler;



import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.web.session.HttpSessionEventPublisher;

import com.pranjay.service.UserManagementService;

public class HttpEventDestroyedListener extends HttpSessionEventPublisher {
	
	
	private final Log logger=LogFactory.getLog(HttpEventDestroyedListener.class);
	   @Override
	   public void sessionCreated(HttpSessionEvent event) {
	      super.sessionCreated(event);
	   }

	   @Override
	   public void sessionDestroyed(HttpSessionEvent event) {
		   HttpSession session=event.getSession();
		
		   String userName=((SecurityContext)session.getAttribute("SPRING_SECURITY_CONTEXT")).getAuthentication().getName();
		   if(userName!=null||userName!="" && session.getAttribute("manual_logout")!=null ){
			   logger.debug("Logging Logout time for user:"+userName);
			   UserManagementService userManageService=(UserManagementService)org.springframework.web.context.ContextLoaderListener.getCurrentWebApplicationContext().getBean("usermanagementService");
			   userManageService.logOutTimeStamp(userName,"AUTO");
			   session.removeAttribute("manual_logout");
		   }
		   logger.debug("UserName is null in session");
		  logger.debug("manual logout is triggerred");
	      super.sessionDestroyed(event);
	   }

	}