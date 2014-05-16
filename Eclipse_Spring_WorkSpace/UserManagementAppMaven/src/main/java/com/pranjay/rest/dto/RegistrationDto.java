package com.pranjay.rest.dto;


import com.pranjay.rest.form.RegisterForm;
import com.pranjay.rest.model.UserModel;
import com.pranjay.rest.util.EncodingUtil;
/**
 * this class is used to convert the registration form to {@link UserModel}
 * @author pranjay
 *
 */
public class RegistrationDto {
/**
 * method will convert the user registration form to {@link UserModel}
 * @param registForm
 *                  the form object filled by user for registration
 * @return
 *        {@link UserModel}
 */        
public static UserModel formToUser(RegisterForm registForm){
UserModel user=new UserModel();
user.setUserID(registForm.getUserName());
user.setFirstName(registForm.getFirstName());
user.setPassword(EncodingUtil.encryptPassword(registForm.getUserName(),registForm.getPassword()));
user.setLastName(registForm.getLastName());
user.setEmailID(registForm.getEmail());
user.setRole("ROLE_USER");
return user;
}
}
