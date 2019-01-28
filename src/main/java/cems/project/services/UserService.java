package cems.project.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import cems.project.model.UserDetail;
import cems.project.respository.UserDetailRepository;

@Service
@Configuration
public class UserService {
	Logger logger = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private UserDetailRepository userDetailRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
//	@Autowired
//	private ModelMapper modelMapper;
	
	public String encode(String rawPassword) {
		if(StringUtils.isEmpty(rawPassword)) {
			throw new IllegalArgumentException();
		}
		//logger.info("Password encoded yo : "+ passwordEncoder.encode(rawPassword));
		return passwordEncoder.encode(rawPassword);
	}
	
	public UserDetail getLoginUserData(int id){
		return userDetailRepository.findById(id);
	}
	
}
