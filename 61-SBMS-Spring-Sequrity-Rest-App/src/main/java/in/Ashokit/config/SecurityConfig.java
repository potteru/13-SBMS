package in.Ashokit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// Default configuration
		/*
		http.authorizeRequests().anyRequest().authenticated();
		http.formLogin();
		http.httpBasic();
		*/
	// Customized Authentication	
		http.authorizeRequests()
			.antMatchers("/balance").authenticated()
			.antMatchers("/statement").authenticated()
			.antMatchers("myloan").authenticated()
			.antMatchers("/home").permitAll()
			.antMatchers("/contact").permitAll()
			.and().formLogin()
			.and().httpBasic();
	}
	
	// In-Memory Authentication
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("aadi").password("aadi@123").and()
		.withUser("shiva").password("shiva@123").and()
		.withUser("rama").password("rama@123").and()
		.passwordEncoder(NoOpPasswordEncoder.getInstance());
		
		
	}

}
