package com.initializer.spring.currencyconvertingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.initializer.spring.currencyconvertingservice")
@EnableDiscoveryClient
public class CurrencyConvertingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConvertingServiceApplication.class, args);
	}

}
