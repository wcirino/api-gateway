package com.cn.novaera.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}

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
