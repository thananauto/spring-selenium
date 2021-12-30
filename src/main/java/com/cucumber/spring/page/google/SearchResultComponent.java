package com.cucumber.spring.page.google;

import com.cucumber.spring.annotations.PageFragment;
import com.cucumber.spring.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;



@Component
public class SearchResultComponent extends BasePage {

    @FindBy(css = "div.g")
    private List<WebElement> lstResults;


    public int getCount(){

        return this.lstResults.size();
    }

    @Override
    public boolean isAt() {
        return false;
    }
}
