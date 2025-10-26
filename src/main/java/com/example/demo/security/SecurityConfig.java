package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authorizeHttpRequests(auth -> auth
                // ✅ Cho phép truy cập các API đăng nhập / đăng ký / refresh
                .requestMatchers(
                    "/api/authentications/**",
                    "/api/users/**").permitAll()
                // ✅ Các request khác bắt buộc phải có token
                .anyRequest().authenticated()
            )
            // Tắt login form mặc định
            .formLogin(form -> form.disable())
            // Tắt HTTP Basic
            .httpBasic(basic -> basic.disable());

        return http.build();
    }
}