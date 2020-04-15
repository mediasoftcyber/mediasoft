package com.redojet.user.service;

import java.util.Date;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redojet.user.model.User;
import com.redojet.user.repository.UserRepository;
import com.redojet.util.PasswordUtil;

@Service
public class UserServiceImpl implements UserService {

	Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	UserRepository userRepo;
	
	/**
	 * This method is for registering user
	 * @param User
	 * @return User
	 */
	
	@Override
	public User registerUser(User user) {
		logger.debug("service method executed");
		
		//Encrypt the password
		user.setPassword(PasswordUtil.encrypt(user.getPassword()));
		logger.info("Password Encrypted");
		user.setCreationDate(new Date());
		user.setStatus(true);
		user.setType("customer");
		
		user = userRepo.save(user);
		
		logger.info("User Details saved to Database");
		return user;
	}

}
