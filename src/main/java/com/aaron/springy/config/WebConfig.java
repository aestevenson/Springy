package com.aaron.springy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//Marks it has a Configuration object, so Spring can bootstrap it at startup.
@Configuration

//This annotation tells Spring to look for Jackson library and to use
//it for serialing requests and deserializing responses.
@EnableWebMvc
public class WebConfig{
   
}