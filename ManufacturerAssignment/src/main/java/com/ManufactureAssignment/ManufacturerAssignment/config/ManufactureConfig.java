package com.ManufactureAssignment.ManufacturerAssignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ManufactureConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		    .authorizeRequests()
		    .antMatchers("/home","login", "register").permitAll()
		    .antMatchers("/users/**").hasRole("Admin")
		    .anyRequest()
		    .authenticated()
		    .and()
		    .httpBasic();
	}

	@Override
	protected UserDetailsService userDetailsService() {
	//	UserDetails obj=User.builder();
		
		return null;
		}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Aniket").password(this.passwordEncoder().encode("Aniket1234")).roles("GeneralUser");
		auth.inMemoryAuthentication().withUser( "milind").password(this.passwordEncoder().encode("mili1234")).roles("Admin");
	}
@Bean
public PasswordEncoder passwordEncoder()
{
	return new BCryptPasswordEncoder(10);
}

}
