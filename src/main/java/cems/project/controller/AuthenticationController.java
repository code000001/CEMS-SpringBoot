package cems.project.controller;


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

/* Author			: Phakhanan Thongmee
 * Author ID		: 58160673
 * Class			: AuthenticationController
 * Module			: Authentication
 * Last edited		: 01/05/2019
 */
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
	
	/* Author			: Phakhanan Thongmee
	 * Author ID		: 58160673
	 * Function			: POST login
	 * Function input	: 
	 * 						as path 		=> -
	 * 						as parameter	=> account login (acc_login) : String
	 * Function output	: specific student data follow the account login
	 * Purpose			: POST api for authentication module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	@PostMapping(path="/login")
	public @ResponseBody UserDetail getLoginUserData(String acc_login){
		UserDetail userDetail = userDetailRepository.findByAccLogin(acc_login);
		return userService.getLoginUserData(userDetail.getUserId());
	}
	//END OF POST login
	
	@GetMapping(path="/getUserData/{id}")
	public @ResponseBody StudentQualificationPersonDetail getAccountRegisteredData(@PathVariable("std_acc_id") int std_acc_id){
		
		return sqcService.getAccountRegisteredData(std_acc_id);
	}
	
	@GetMapping(path="/getOrgData/{id}")
	public @ResponseBody StaffOrgData getStaffOrgData(@PathVariable("id") int id){
		
		return staffOrgService.getStaffOrgDataBystfOrgAccId(id);
	}
	
}
//END OF CLASS AuthenticationController
