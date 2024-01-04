package com.lvd.app.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication: Anotación que sirve para habilitar tres funciones:
// @EnableAutoConfiguration: habilita el mecanismo de configuración automática de Spring Boot
// @ComponentScan: habilite @Component el escaneo en el paquete donde se encuentra la aplicación 
// @Configuration: permite registrar beans adicionales en el contexto o importar clases de configuración adicionales
@SpringBootApplication
public class SrvProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrvProductsApplication.class, args);
	}

}
