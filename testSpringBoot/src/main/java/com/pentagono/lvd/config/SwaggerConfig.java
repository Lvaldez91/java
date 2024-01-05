package com.pentagono.lvd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
@EnableSwagger2WebMvc 
@EnableSwagger2
@Component
public class SwaggerConfig {
	
	// docs url type json: http://localhost:8080/v2/api-docs
	// docs interface: http://localhost:8080/swagger-ui.html
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.pentagono.lvd.rest"))
				.paths(PathSelectors.any())
				.build();
	}
}
