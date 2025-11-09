/*package dk.via.pro3_assignment_restapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())              // disable CSRF for testing (important for POST)
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()              // allow all endpoints
                )
                .httpBasic(basic -> basic.disable())       // disable login popup
                .formLogin(form -> form.disable());        // disable default login page
        return http.build();
    }
}*/