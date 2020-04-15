package com.redojet.user.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class UserAddress {
	
	@Id
	private String addId;
	
	private String addType;
	
	private String addStatus;

	private String addLine1;
	
	private String addLine2;
	
	private String city;
	
	private Integer pinCode;
	
	private String state;
	
	private String country;
}
