package br.com.orangetalents.carmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CarManagerApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(CarManagerApplication.class, args);

	}

}
 