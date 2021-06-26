package com.rllontop.devops;

import com.rllontop.devops.web.security.ApiKeyAuthenticationFilter;
import com.rllontop.devops.web.security.JWTAuthorizationFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AnonymousAuthenticationFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@SpringBootApplication
public class DevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
	}

	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
					.addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
					.addFilterBefore(
							new ApiKeyAuthenticationFilter(authenticationManager()),
							AnonymousAuthenticationFilter.class)
					.authorizeRequests()
					.antMatchers(HttpMethod.POST, "/user").permitAll()
					.anyRequest().authenticated();
		}
	}




}
