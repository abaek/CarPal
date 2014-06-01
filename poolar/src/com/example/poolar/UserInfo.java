package com.example.poolar;

import java.util.Date;
import java.util.List;

public class UserInfo {
	private String name;
	private String password;
	private String email;
	private Integer numPosts;
	private Date dateCreated;
	private Integer numThumbsUp;
	private Integer numThumbsDown;
	private Boolean verified;
	
	public UserInfo(String inputName, String inputPassword, String inputEmail, Integer inputNumPosts, Date inputDateCreated, 
			Integer inputNumThumbsUp, Integer inputNumThumbsDown, Boolean inputVerified){
		name = inputName;
		password = inputPassword;
		email = inputEmail;
		numPosts = inputNumPosts;
		dateCreated = inputDateCreated;
		numThumbsUp = inputNumThumbsUp;
		numThumbsDown = inputNumThumbsDown;
		verified = inputVerified;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getEmail(){
		return email;
	}
	
	public Integer getNumPosts(){
		return numPosts;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public Integer getNumThumbsUp(){
		return numThumbsUp;
	}
	
	public Integer getNumThumbsDown(){
		return numThumbsDown;
	};
	
	public Boolean verified(){
		return verified;
	}
	
	
}