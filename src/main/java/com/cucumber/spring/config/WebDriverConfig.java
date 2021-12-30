package com.cucumber.spring.config;

import com.cucumber.spring.annotations.LazyConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;


@Configuration
@Profile("!remote")
public class WebDriverConfig {


    @Bean
    @ConditionalOnProperty(name="browser.name", havingValue ="chrome")
    //@ConditionalOnMissingBean -- Keep it in last declaration option
    public WebDriver getChromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Bean
    @ConditionalOnProperty(name="browser.name", havingValue = "safari")
    public WebDriver getSafariDriver(){
        //WebDriverManager.phantomjs().setup();
        return new SafariDriver();
    }



}
