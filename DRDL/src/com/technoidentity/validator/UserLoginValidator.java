package com.technoidentity.validator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.technoidentity.model.ProjectManager;
import com.technoidentity.model.User;
import com.technoidentity.service.ProjectManagerService;
import com.technoidentity.service.UserService;


@Component("userLoginValidator")
public class UserLoginValidator {
	@Autowired
	private UserService userService;
	
	public boolean supports(Class<?> klass) {
		   return User.class.isAssignableFrom(klass);
	  }
	
	public void validate(Object target, Errors errors){
		User user = (User) target;
		if ((user.getName() != null) && (user.getName().length() > 0)){
			user.setName(user.getName().trim());
			//List adminlist = adminService.validateLoginAdmin(admin.getAdminEmail(),admin.getPassword());			
			List userlist = userService.validateLoginUser(user.getName(),user.getPassword());
			if ((userlist != null) && (userlist.size() > 0)) {
			  }else {
				errors.rejectValue("name","notMatchNameAndPassword.user.name","User Name or Password you entered is incorrect.");
			  }
		 }
    }
 }
