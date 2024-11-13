package com.example.demo.config;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

	String CLASS_NAME=this.getClass().getName();
	Logger logger=Logger.getLogger(CLASS_NAME);
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService userDetails() {
		String UName="JJ";
        String pass="JJ";
		System.out.println("Password before encoding :"+pass);
		UserDetails normalUser = User.withUsername(UName).password(passwordEncoder().encode(pass)).roles("NORMAL")
				.build();
		System.out.println("Password after encoding :"+passwordEncoder().encode(pass));

		UserDetails adminUser = User.withUsername("JK").password(passwordEncoder().encode("JJKK")).roles("ADMIN").build();

		return new InMemoryUserDetailsManager(normalUser, adminUser);

	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeHttpRequests()
/*		.requestMatchers("/home/normal")
		.hasRole("NORMAL")
		.requestMatchers("/home/admin")
		.hasRole("ADMIN")
		.requestMatchers("/home/public")
		.permitAll()*/
		.anyRequest()
				.authenticated().and().formLogin();
		return httpSecurity.build();
	}
}
