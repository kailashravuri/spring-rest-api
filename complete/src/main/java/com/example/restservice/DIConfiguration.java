package com.example.restservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.restservice")
public class DIConfiguration {
    @Bean
    public MessageService messageService()
    {
        return new GreetingMessageService();
    }
}