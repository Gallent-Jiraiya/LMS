package com.group7.lms.utility;



import com.group7.lms.security.UserDetails;

import io.jsonwebtoken.Claims;

//@Component
public class JwtUtility {

	 	private static final String SECRET_KEY = "lms_lms_lms";

	    private static final int TOKEN_VALIDITY = 3600 * 5;
	    
	    
	   

		private String getClaimFromToken(String token, Object object) {
			// TODO Auto-generated method stub
			return null;
		}




		public String getUsernameFromToken1(String jwtToken) {
			// TODO Auto-generated method stub
			return null;
		}




		public boolean validateToken(String jwtToken, UserDetails userDetails) {
			// TODO Auto-generated method stub
			return false;
		}




		public String getUsernameFromToken(String jwtToken) {
			// TODO Auto-generated method stub
			return null;
		}

	
	
}
