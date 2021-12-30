package com.cucumber.spring.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ConditionalOnProperty(name ="driver.factory", havingValue = "on")
public class DriverFactory {

    @Bean
    public WebDriver getDriver(String browserName){

        return browserName.equals("Chrome") ? new ChromeDriver() : new FirefoxDriver();

    }
}
