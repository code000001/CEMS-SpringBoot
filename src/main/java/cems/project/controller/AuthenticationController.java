package cems.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cems.project.model.StaffOrgData;
import cems.project.model.StudentQualificationPersonDetail;
import cems.project.model.UserDetail;
import cems.project.respository.UserDetailRepository;
import cems.project.services.StaffOrgDataService;
import cems.project.services.StudentQualificationService;
import cems.project.services.UserService;

@CrossOrigin
@RestController
@RequestMapping(path="/cems")
public class AuthenticationController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserDetailRepository userDetailRepository;
	@Autowired
	private StudentQualificationService sqcService;
	
	@Autowired
	private StaffOrgDataService staffOrgService;
	
	@PostMapping(path="/login")
	public @ResponseBody UserDetail getLoginUserData(String acc_login){
		UserDetail userDetail = userDetailRepository.findByAccLogin(acc_login);
		return userService.getLoginUserData(userDetail.getUserId());
	}
	
	@GetMapping(path="/getUserData/{id}")
	public @ResponseBody StudentQualificationPersonDetail getAccountRegisteredData(@PathVariable("std_acc_id") int std_acc_id){
		
		return sqcService.getAccountRegisteredData(std_acc_id);
	}
	
	@GetMapping(path="/getOrgData/{id}")
	public @ResponseBody StaffOrgData getStaffOrgData(@PathVariable("id") int id){
		
		return staffOrgService.getStaffOrgDataBystfOrgAccId(id);
	}
	

}
