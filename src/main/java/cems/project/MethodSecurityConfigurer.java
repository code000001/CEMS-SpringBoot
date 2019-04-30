package cems.project;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

/* Author			: Phakhanan Thongmee
 * Author ID		: 58160673
 * Class			: MethodSecurityConfigurer inherited from GlobalMethodSecurityConfiguration
 * Module			: Authentication
 * Last edited		: 01/05/2019
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MethodSecurityConfigurer extends GlobalMethodSecurityConfiguration{

}
//END OF CLASS MethodSecurityConfigurer