package com.vestal.clinica_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication
@EnableTransactionManagement
public class ClinicaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicaApiApplication.class, args);
	}

}