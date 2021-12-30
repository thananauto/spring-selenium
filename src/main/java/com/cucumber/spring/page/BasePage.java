package com.cucumber.spring.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public abstract class BasePage {

    @Autowired
    public WebDriver driver;

    @Lazy
    @Autowired
    protected WebDriverWait webDriverWait;

    @PostConstruct
    public void init(){
        PageFactory.initElements(this.driver, this);
    }


    @PreDestroy
    public void quitDriver(){
        this.driver.quit();
    }

    public abstract boolean isAt();

}
