package com.cucumber.spring.config;

import com.cucumber.spring.annotations.LazyConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;

import java.net.URL;

@Configuration
@Profile("remote")
public class RemoteWebDriverConfig {

    @Value("${remote.url}")
    private URL url;

    @Bean
    @ConditionalOnProperty(name="browser.name", havingValue = "chrome")
    public WebDriver getChromeRemoteUrl(){
        return new RemoteWebDriver(this.url, DesiredCapabilities.chrome());
    }

    @Bean
    @ConditionalOnMissingBean
    public WebDriver getFirefoxRemoteUrl(){
        return new RemoteWebDriver(this.url, DesiredCapabilities.firefox());
    }


}
