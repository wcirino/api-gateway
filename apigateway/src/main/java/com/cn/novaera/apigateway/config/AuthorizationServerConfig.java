package com.cn.novaera.apigateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class AuthorizationServerConfig {

		@Autowired
		private BCryptPasswordEncoder passwordEncode;
	
}
