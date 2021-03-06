package com.isaac.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.isaac.bookstore.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dBService;
	
	@Bean
	public void instanciaBaseDeDados() {
		this.dBService.instanciaBaseDeDados();
	}
	
}
