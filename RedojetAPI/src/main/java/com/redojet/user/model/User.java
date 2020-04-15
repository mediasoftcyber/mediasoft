package com.redojet.user.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Document
@XmlRootElement(name = "User")
@XmlAccessorType(XmlAccessType.FIELD)
@ApiModel(description = "This is User Model")
public class User {
	
	@Id
	private String userId;
	
	@ApiModelProperty(notes = "This is User's Name")
	private String name;
	
	@ApiModelProperty(notes = "This is User's Mobile Number")
	private Long mobileNo;
	
	@ApiModelProperty(notes = "This is User's Email Id")
	private String emailId;
	
	@ApiModelProperty(notes = "This is User's Password")
	private String password;
	
	private Date creationDate;
	
	private Boolean status;
	
	private String type;
	
}
