package com.group7.lms.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	
	public BCryptPasswordEncoder bCryptPasswordEncoder(){
	    return new BCryptPasswordEncoder();
	}
}
