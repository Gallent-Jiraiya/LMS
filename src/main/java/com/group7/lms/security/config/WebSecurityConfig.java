package com.group7.lms.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.group7.lms.appuser.AppUserService;
import com.group7.lms.security.JwtAuthenticationEntryPoint;
import com.group7.lms.security.JwtRequestFilter;
import com.group7.lms.security.config.Override;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Lazy
    @Autowired
    private AppUserService appUserService;
	
	
	 @Autowired
	    private BCryptPasswordEncoder bCryptPasswordEncoder;

	    @Autowired
	    private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

	    @Autowired
	    private JwtRequestFilter jwtRequestFilter;

	    @Autowired
	    private BCryptPasswordEncoder passwordEncoder;

	    @Bean
	    public AuthenticationManager authenticationManagerBean() {
	        return super.authenticationManagerBean();
	    }


}
