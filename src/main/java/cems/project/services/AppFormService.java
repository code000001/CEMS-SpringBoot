package cems.project.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.model.StudentAllInfo;
import cems.project.respository.StudentOrgApplicationFormRepository;;

@Service
@Configuration
public class AppFormService {
	Logger logger = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private StudentOrgApplicationFormRepository StudentOrgApplicationForm;
	
	public StudentAllInfo getUserData(int acc_id){
		return StudentOrgApplicationForm.findByStdAccId(acc_id);
	}
	
}
