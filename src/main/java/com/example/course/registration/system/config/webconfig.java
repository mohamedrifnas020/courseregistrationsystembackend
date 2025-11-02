package com.example.course.registration.system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class webconfig{

    @Bean
    public WebMvcConfigurer corsconfiguration(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry){
               registry.addMapping("/**").allowedOrigins(
                       "https://mohamedrifnas020.github.io/courseregistrationsystemfrontend",
                       "https://courseregistrationsystembackend-production.up.railway.app"
               ).allowedMethods("GET","POST","PUT","DELETE","OPTIONS").allowedHeaders("*");
            }
        };
    }


}
