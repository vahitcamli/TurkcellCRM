package com.turkcell.TurkcellCRM.customerService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.turkcell.TurkcellCRM.CoreService.annotations.EnableSecurity;

@EnableSecurity
@EnableFeignClients
@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

}
