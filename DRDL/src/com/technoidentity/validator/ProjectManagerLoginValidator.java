package com.technoidentity.validator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.technoidentity.model.ProjectManager;
import com.technoidentity.service.ProjectManagerService;


@Component("projectManagerLoginValidator")
public class ProjectManagerLoginValidator {
	@Autowired
	private ProjectManagerService projectManagerService;
	
	public boolean supports(Class<?> klass) {
		   return ProjectManager.class.isAssignableFrom(klass);
	  }
	
	public void validate(Object target, Errors errors){
		ProjectManager projectManager = (ProjectManager) target;
		if ((projectManager.getName() != null) && (projectManager.getName().length() > 0)){
			projectManager.setName(projectManager.getName().trim());
			//List adminlist = adminService.validateLoginAdmin(admin.getAdminEmail(),admin.getPassword());			
			List projectmanagerlist = projectManagerService.validateLoginEmployee(projectManager.getName(),projectManager.getPassword());
			if ((projectmanagerlist != null) && (projectmanagerlist.size() > 0)) {
			  }else {
				errors.rejectValue("name","notMatchNameAndPassword.projectManager.name","ProjectManager Name or Password you entered is incorrect.");
			  }
		 }
    }
 }
