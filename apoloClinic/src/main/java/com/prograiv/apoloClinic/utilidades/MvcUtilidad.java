package com.prograiv.apoloClinic.utilidades;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcUtilidad implements WebMvcConfigurer{
	
	@Override
	public void addViewControllers(ViewControllerRegistry reg) {
		reg.addViewController("/error_403").setViewName("PROHIBIDO");
	}
	
	@Bean
	public BCryptPasswordEncoder passEncod() {
		return new BCryptPasswordEncoder();
	}
}
