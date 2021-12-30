package com.cucumber.spring.annotations;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
public @interface LazyConfiguration {
}
