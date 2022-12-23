package com.cn.novaera.apigateway.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//@RefreshScope
//@SuppressWarnings("deprecation")
@Configuration
public class AppConfig {
	
	//@Value("${jwt.secret}")
	//private String jwtSecret;
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder ();
	}
	
}
