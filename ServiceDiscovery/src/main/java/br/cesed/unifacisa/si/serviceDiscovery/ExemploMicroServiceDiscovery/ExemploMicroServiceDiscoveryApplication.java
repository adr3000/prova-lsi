package br.cesed.unifacisa.si.serviceDiscovery.ExemploMicroServiceDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ExemploMicroServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploMicroServiceDiscoveryApplication.class, args);
	}

}
