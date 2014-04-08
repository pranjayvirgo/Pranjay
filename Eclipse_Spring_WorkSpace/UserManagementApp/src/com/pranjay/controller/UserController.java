package com.pranjay.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pranjay.dto.RegistrationDto;
import com.pranjay.form.RegisterForm;
import com.pranjay.form.SearchForm;
import com.pranjay.model.UserModel;
import com.pranjay.service.UserManagementService;
import com.pranjay.util.EncodingUtil;

/**
 * this class is the front controller which serves all the request for user
 * managemet like registration,resetting password,searching user received from
 * the client.
 * 
 * @author pranjay
 * 
 */
@Controller
public class UserController {
	@Autowired
	private UserManagementService userManaService;
	private final Log logger = LogFactory.getLog(UserController.class);

	/**
	 * this method will redirect the user to login page.
	 * 
	 * @return
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}

	/**
	 * this method will redirect the user from login page to the user
	 * registration page.
	 * 
	 * @param registerForm
	 * @return
	 */
	@RequestMapping(value = "/userregistration", method = RequestMethod.GET)
	public ModelAndView register(
			@ModelAttribute("registerform") RegisterForm registerForm) {
		return new ModelAndView("userregistration");
	}

	/**
	 * this method will be called when user fillups the registartion form and
	 * submit it.the method will first check if userID already exists using
	 * {@link UserManagementService}if it is already present the user will be
	 * shown the error message and will not be registered again
	 * 
	 * @param registerForm
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String addUser(
			@ModelAttribute("registerform") RegisterForm registerForm,
			BindingResult result) {
		logger.debug("Checking user details in DB for user :"
				+ registerForm.getFirstName());

		boolean existingUser = userManaService.checkExistingUser(registerForm
				.getUserName());
		if (existingUser) {
			logger.debug("User with ID "
					+ registerForm.getFirstName()
					+ " is present in database so redirecting to registration page with error message");
			return "redirect:/registrationfailed";
		} else {
			UserModel userModel = RegistrationDto.formToUser(registerForm);
			userManaService.registerUser(userModel);
		}
		return "redirect:/home";
	}

	/**
	 * this method will show the user home page and will shown only if user is
	 * logged in otherwise user will be redirected to the login page.
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/myhome", method = RequestMethod.GET)
	public String showHomePage(
			@ModelAttribute("searchform") SearchForm searchForm, ModelMap map) {
		map.addAttribute("username", EncodingUtil.getCurrentUser()
				.getUsername());
		return "myhome";
	}

	@RequestMapping(value = "myhome/search", method = RequestMethod.POST)
	public String searchUser(
			@ModelAttribute("searchform") SearchForm searchform, ModelMap map) {
		logger.debug("Fetching Search Results for " + searchform.getUserName());
		List<UserModel> userList = userManaService.searchUser(searchform
				.getUserName());
		logger.info("Search result returned :" + userList.size());
		map.addAttribute("username", EncodingUtil.getCurrentUser()
				.getUsername());
		map.addAttribute("userList",
				userManaService.searchUser(searchform.getUserName()));
		return "searchresult";
	}

	/**
	 * this method will reset the user password and redirect the user to
	 * newpassword page and the user existing session will be invalidated.
	 * 
	 * @param map
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/myhome/reset", method = RequestMethod.GET)
	public String resetPassword(ModelMap map, HttpSession session) {
		User user = EncodingUtil.getCurrentUser();
		logger.debug("Resetting the password for user :" + user.getUsername());
		String newPassword = RandomStringUtils.randomAlphanumeric(10);
		userManaService.resetPassword(user.getUsername(),
				EncodingUtil.encryptPassword(user.getUsername(), newPassword));
		logger.debug("New Password Successfully generated");
		EncodingUtil.getSecurityContext().setAuthentication(null);
		logger.debug("Session Invalidated and user is redirected to newPasswor page");
		userManaService.logOutTimeStamp(user.getUsername(), "RESET");
		map.addAttribute("newpassword", newPassword.toString());
		return "newpassword";

	}

	/**
	 * this method will redirect to the login page when user clicks on logout
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		model.addAttribute("error", "true");
		return "home";
	}

	/**
	 * this method will return user to the registration form if registration
	 * failed due to userID is present in database
	 * 
	 * @param registerForm
	 * @param model
	 * @return
	 */

	@RequestMapping(value = "/registrationfailed", method = RequestMethod.GET)
	public String registrationFailed(
			@ModelAttribute("registerform") RegisterForm registerForm,
			ModelMap model) {
		model.addAttribute("error", "true");
		logger.info("Registrating failed due to duplicated user id");
		return "userregistration";
	}

}
