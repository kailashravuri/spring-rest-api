package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

public class GreetingMessageService implements MessageService {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    public Greeting getMessage(String message)
    {
        return new Greeting(counter.incrementAndGet(), String.format(template, message));
    }
}