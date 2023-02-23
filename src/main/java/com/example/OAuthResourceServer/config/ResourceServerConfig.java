package com.example.OAuthResourceServer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class ResourceServerConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .mvcMatcher("/api/v1/**")
                .authorizeRequests()
                .mvcMatchers("/api/v1/**")
                .access("hasAuthority('SCOPE_vempalli.read')")
                .and()
                .oauth2ResourceServer()
                .jwt();

                return  httpSecurity.build();
    }

}
