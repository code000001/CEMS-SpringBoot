package cems.project.services;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cems.project.model.UserDetail;
import cems.project.respository.UserDetailRepository;

@Service
public class UserServiceImp implements UserDetailsService {
	
	Logger logger = LoggerFactory.getLogger(UserServiceImp.class);
	@Autowired
	private UserDetailRepository userDetailRepository;
	
	@Override
	public UserDetails loadUserByUsername(String accLogin) {
		String role = "student";
		UserDetail userDetail = userDetailRepository.findByAccLogin(accLogin);
		if(userDetail == null) {
			throw new UsernameNotFoundException("Username not found.");
		}

		if(userDetail.getAccTypeId() == 1) {
			role = "admin";
		}
		if(userDetail.getAccTypeId() == 3) {
			role = "staff";
		}
		if(userDetail.getAccTypeId() == 4) {
			role = "org_agent";
		}
		
		List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority(role));
		logger.info("Role : "+ role);
		return new User(userDetail.getAccLogin(),userDetail.getAccPassword(),authorities);
	}
}
