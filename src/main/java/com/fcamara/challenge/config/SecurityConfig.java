package com.fcamara.challenge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests((authorize) -> authorize
                .requestMatchers("/auth/**", "/auth").permitAll()
            )
            .authorizeHttpRequests((authorize) -> authorize
                .requestMatchers("/api/**").authenticated()
            )
            /**
             * To-Do:
             * Add JWT authentication and authorization
             */
            //  .addFilterBefore((request, response, chain) -> {
            //     // Perform JWT authentication logic here
            //     // If authentication is successful, set the authenticated user in the security context
            //     return null;
            // }, UsernamePasswordAuthenticationFilter.class)
            // .addFilterAfter((request, response, chain) -> {
            //     // Perform JWT authorization logic here
            //     // If authorization fails, return an unauthorized response
            //     return null;
            // }, JwtAuthenticationFilter.class)
            .build();
    }

}