package com.pranjay.rest.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pranjay.rest.model.UserModel;
import com.pranjay.rest.service.UserManagementService;
@Controller
public class UserRestController {
	@Autowired
	private UserManagementService userManaService;
	private final Log logger = LogFactory.getLog(UserRestController.class);
	 @RequestMapping(value = "/myhome/user/{id}", method = RequestMethod.GET)
	    public @ResponseBody List<UserModel> getUser(@PathVariable("id") String empId) {
	        logger.info("Start getEmployee. ID="+empId);
	         
	        logger.debug("Parameter Value " + empId);
			List<UserModel> userList = userManaService.searchUser(empId);
			logger.info("Search result returned :" + userList.size());
			
			return userList;
	    }
}
