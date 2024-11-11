package com.connectly.config;

//import java.sql.Date;

import javax.crypto.SecretKey;
import java.util.Date;
import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JwtProvider {
	
	private static SecretKey key = Keys.hmacShaKeyFor(JwtConstant.SECRET_KEY.getBytes());
	
	public static String generateToken (Authentication auth) {
		String jwt= Jwts.builder()
		    .setIssuer ("Connectly").setIssuedAt (new Date())
		    .setExpiration (new Date(new Date().getTime() + 86400000))
		    .claim("email", auth.getName())
		    .signWith(key)
		    .compact () ;

		return jwt;
		}
	
	public static String getEmailFromJwtToken(String jwt) {
		
		// bearer frnegvorg (key)
		jwt = jwt.substring(7);
		Claims claims = Jwts.parserBuilder()
				.setSigningKey(key).build().parseClaimsJws(jwt).getBody();
		String email = String.valueOf(claims.get("email"));
		
		return email;
		
	}
	

} 
