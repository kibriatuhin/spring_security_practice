package com.spring_security.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MyCustomAuthProvider implements AuthenticationProvider {
    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {


        //userInput credentials
        String password = authentication.getCredentials().toString();
        //fetch records form inmemery db
       var user =  userDetailsService.loadUserByUsername(authentication.getName());
       if (user != null && passwordEncoder.matches(password,user.getPassword())){
            new UsernamePasswordAuthenticationToken(authentication.getName(),authentication.getCredentials());
       }

        return (Authentication) new BadCredentialsException("Error !!!");
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.equals(authentication);
    }
}

