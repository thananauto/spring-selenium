package com.cucumber.spring.page.google;

import com.cucumber.spring.annotations.PageFragment;
import com.cucumber.spring.page.BasePage;
import com.github.javafaker.Bool;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class SearchComponent extends BasePage {

    @FindBy(name="q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private List<WebElement> searchBtns;



    public void search(final String keyword){
        this.searchBox.sendKeys(keyword);
        this.searchBox.sendKeys(Keys.TAB);
        this.searchBtns
                .stream()
                .filter(e -> e.isDisplayed() && e.isEnabled())
                .findFirst()
                .ifPresent(e-> e.click());
    }

    @Override
    public boolean isAt() {
        return this.webDriverWait.until(new ExpectedCondition<Boolean>() {
            @NullableDecl
            @Override
            public Boolean apply(@NullableDecl WebDriver webDriver) {
                return searchBox.isDisplayed();
            }
        });

        //return this.webDriverWait.until(d -> this.searchBox.isDisplayed());
    }


}









