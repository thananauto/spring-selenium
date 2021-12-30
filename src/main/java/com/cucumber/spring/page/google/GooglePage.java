package com.cucumber.spring.page.google;

import com.cucumber.spring.annotations.Page;
import com.cucumber.spring.page.BasePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class GooglePage extends BasePage {

    @Autowired
    private SearchComponent searchPage;

    @Autowired
    private SearchResultComponent searchResult;

    @Value("${application.url}")
    private String applicationUrl;

    public SearchComponent getSearchPage() {
        return searchPage;
    }

    public SearchResultComponent getSearchResult() {
        return searchResult;
    }

    public void goTo(){
        this.driver.get(applicationUrl);
    }
    @Override
    public boolean isAt() {
        return this.searchPage.isAt();
    }

}
