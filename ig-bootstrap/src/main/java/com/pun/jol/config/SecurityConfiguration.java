package com.pun.jol.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SecurityConfiguration {

    private String allowedMethods = "*";

    private String allowedHeaders = "*";

    private String corsConfiguration = "/**";

    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer(){
            public void addCorsMappings(final CorsRegistry registry){
                registry.addMapping(corsConfiguration).allowedHeaders(allowedHeaders).allowedMethods(allowedMethods);
            }
        };
    }
}
