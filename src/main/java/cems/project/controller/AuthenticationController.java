package cems.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cems.project.model.UserDetail;
import cems.project.respository.UserDetailRepository;
import cems.project.services.UserService;

@CrossOrigin
@RestController
@RequestMapping(path="/cems")
public class AuthenticationController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserDetailRepository userDetailRepository;

	
	@PostMapping(path="/login")
	public @ResponseBody UserDetail getLoginUserData(String acc_login){
		UserDetail userDetail = userDetailRepository.findByAccLogin(acc_login);
		return userService.getLoginUserData(userDetail.getUserId());
	}
}
