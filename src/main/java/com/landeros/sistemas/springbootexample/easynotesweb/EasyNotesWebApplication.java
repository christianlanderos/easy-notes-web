package com.landeros.sistemas.springbootexample.easynotesweb;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@SpringBootApplication
@EnableJpaAuditing
public class EasyNotesWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyNotesWebApplication.class, args);
	}
	
	
}
