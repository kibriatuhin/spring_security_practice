package com.spring_security.security;

/*import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DefaultSpringSecurityConfig {
    
    //UserDetailsService
    @Bean
    public UserDetailsService userDetailsService(){
        var inMemoryUserDetailsManager = new InMemoryUserDetailsManager();
        var user = User.withUsername("Tuhin").password("123").authorities("read").build();
        inMemoryUserDetailsManager.createUser(user);

        return inMemoryUserDetailsManager;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}*/
