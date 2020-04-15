package com.redojet.user.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Document
public class SellerUser extends User {

	private Long altMobileNo;
	
	private String idProofType;
	
	private String idProofNo;
	
	private String idProofImageUrl;
	
	private List<String> personImageUrl = new ArrayList<String>();
	
	private String pan;
	
	private String gstNo;
	
	private String bankName;
	
	private String ifscCode;
	
	private Long accountNo;
	
	private Boolean approved;
	
	private List<String> remarks = new ArrayList<String>();
}
