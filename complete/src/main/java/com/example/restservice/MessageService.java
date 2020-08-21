package com.example.restservice;

import org.springframework.stereotype.Component;

@Component
public interface MessageService {
    public Greeting getMessage(String message);
}