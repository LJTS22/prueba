package com.example.pruebas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.webmvc.autoconfigure.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;

@SpringBootApplication
public class PruebasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebasApplication.class, args);
	}

	@Configuration
	public static class MyConfiguration {
		@Bean
		public WebMvcConfigurer  cosrConfigurer()
		{

			return new WebMvcConfigurer() {
				@Override
				public void addCorsMappings(CorsRegistry registry)
				{
					registry.addMapping("/**").allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
				}
			};

		}
	}
}
