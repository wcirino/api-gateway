package com.cn.novaera.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder
				.routes()
					//Cn-beneficiario
					.route(r -> r.path("/api-beneficiario/**").uri("lb://cnbeneficiario"))
					//cn-agendamento-exame-consulta
					.route(r -> r.path("/api-agendamento/**").uri("lb://cn-agendamento-exame-consulta"))
					.route(r -> r.path("/api-consulta/**").uri("lb://cn-agendamento-exame-consulta"))
					.route(r -> r.path("/api-exame/**").uri("lb://cn-agendamento-exame-consulta"))
					//email
					.route(r -> r.path("/api-enviando/**").uri("lb://cn-eml"))
					//file
					.route(r -> r.path("/api-file/**").uri("lb://cnfile"))
					.route(r -> r.path("/api-documento-benef/**").uri("lb://cnfile"))
					.route(r -> r.path("/api-documento/**").uri("lb://cnfile"))
					//prestador
					.route(r -> r.path("/api-prestador/**").uri("lb://cn-prestador"))
					.build();
	}
	
}
