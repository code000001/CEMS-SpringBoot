package cems.project;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import cems.project.services.UserServiceImp;

@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter{
	
	Logger logger = LoggerFactory.getLogger(WebSecurityConfigurer.class);
	@Autowired
	UserServiceImp userServiceImp;

	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		final CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(Arrays.asList("*"));
		configuration.setAllowedMethods(Arrays.asList("HEAD", "GET", "POST", "PUT", "DELETE", "PATCH"));
		configuration.setAllowCredentials(true);
		configuration.setAllowedHeaders(Arrays.asList("*"));
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors()
		.and().csrf().disable()
		.authorizeRequests()
		.antMatchers("/cems/index","/cems/announcement", "/cems/announcement_organization_data",
				"/cems/announcement_organization_data/{\\d+}", "/cems/announcement_org/{\\d+}",
				"/cems/announcement_knowledge/{\\d+}","/cems/announcement_logKnowledge/{\\d+}",
				"/cems/announcement_logPosition/{\\d+}","/cems/announcement_position_data/{\\d+}").permitAll()
		.anyRequest().authenticated()
		.and().logout().logoutSuccessHandler(new HttpStatusReturningLogoutSuccessHandler())
		.and().httpBasic()
		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS);
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
	}
	
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    	logger.info("Password encoded yo : "+  BCrypt.hashpw("58160651", BCrypt.gensalt()));
        auth.userDetailsService(userServiceImp).passwordEncoder(passwordEncoder);
    }
	
}
