package com.pentagono.lvd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Configuration
@EnableSwagger2
public class PentagonoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PentagonoApplication.class, args);
	}
/*
 * //exclude = {DataSourceAutoConfiguration.class},
@SpringBootApplication(proxyBeanMethods = false)
@ComponentScan({"com.pentagono.lvd.rest"})
@EntityScan("com.pentagono.lvd.entitys")
@EnableJpaRepositories("com.pentagono.lvd.dao")*/
}
