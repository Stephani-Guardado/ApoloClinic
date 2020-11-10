package com.prograiv.apoloClinic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.prograiv.apoloClinic.servicios.MiUsuarioDetailsService;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	MiUsuarioDetailsService udService;
	
	@Autowired
	BCryptPasswordEncoder passEncod;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/", "/save-paciente", "/registro", "/plantillas/**", "/css/**", "/img/**", "/js/**").permitAll()
		.antMatchers("/admin", "/crud-doctors", "/crud-nurses").hasAnyRole("ADMIN")
		.antMatchers("/doctor").hasAnyRole("DOCTOR")
		.antMatchers("/nurse").hasAnyRole("NURSE")
		.antMatchers("/paciente").hasAnyRole("PACIENTE")
		.anyRequest().authenticated()
		.and()
		.formLogin().loginPage("/login").permitAll()
		.and()
		.logout().permitAll()
		.and()
		.exceptionHandling().accessDeniedPage("/error_403");
	}
	
	@Autowired
	public void configurerGlobal(AuthenticationManagerBuilder build) throws Exception {
		build.userDetailsService(udService).passwordEncoder(passEncod);
	}	
}