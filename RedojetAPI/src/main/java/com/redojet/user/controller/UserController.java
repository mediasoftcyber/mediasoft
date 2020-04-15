package com.redojet.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redojet.user.model.User;
import com.redojet.user.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api("UserModule")
@RestController
public class UserController {
	
	Logger logger = Logger.getLogger(UserController.class);
	@Autowired
	private UserService userService;

	/**
	 * This Method is used for Registering New User only for Seller 
	 * and Customer
	 * @param req
	 * @return
	 */
		@ApiOperation(value="This is for Registering New User",
			produces="application/json",
			response=User.class
			)
		@ApiResponses(value = {

        @ApiResponse(code = 200, message = "User Successfully Registered"),

        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),

        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),

							})
		
	@RequestMapping(path = "/registerUser", method = RequestMethod.POST, produces= {"application/json"})
	ResponseEntity<Object> registerUser(HttpServletRequest req){
		logger.debug("User Registeration started");
		String name = req.getParameter("name");
		Long mobileNo;
		try{
			mobileNo = Long.parseLong(req.getParameter("mobileNo"));
			if(mobileNo.toString().length()<10)
				throw new NumberFormatException();
		}catch(NumberFormatException nfe) {
			logger.error("Mobile Number: Invalid Format!");
			throw new NumberFormatException("Mobile Number: Invalid Format!");
		}
		String emailId = req.getParameter("emailId");
		String password = req.getParameter("password");
		
		User user = new User();
		user.setName(name);
		user.setMobileNo(mobileNo);
		user.setEmailId(emailId);
		user.setPassword(password);
		
		user = userService.registerUser(user);
		logger.info("User Registration Success");
		
		return ResponseEntity.ok(user);
	}
}
