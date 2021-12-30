package com.cucumber.spring.googletest;

import com.cucumber.spring.SpringSeleniumTestNG;
import com.cucumber.spring.page.google.GooglePage;
import com.cucumber.spring.util.ScreenShotUtil;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class GoogleSearchResult2Test extends SpringSeleniumTestNG {

    @Autowired
    private GooglePage googlePage;

    @Lazy
    @Autowired
    private ScreenShotUtil screenShotUtil;

    @Autowired
    private Faker faker;


    @Test
    public void searchGoogleKeyword() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());

        this.googlePage.getSearchPage().search("spring");
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);

        this.screenShotUtil.getScreenShot(faker.name().firstName().replace(" ","")+".png");



    }
}
