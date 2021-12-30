package com.cucumber.spring.config;

import com.cucumber.spring.annotations.LazyConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class WebDriverWaitConfig {

    @Value("${default.timeout:30}")
    private int timeOut;

    @Bean
    public WebDriverWait getWebDriverWait(WebDriver driver){
        return  new WebDriverWait(driver, timeOut);
    }

}
