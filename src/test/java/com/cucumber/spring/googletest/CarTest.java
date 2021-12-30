package com.cucumber.spring.googletest;

import com.cucumber.spring.SpringSeleniumTestNG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.testng.annotations.Test;


public class CarTest  extends SpringSeleniumTestNG {

    @Qualifier("fiat")
    @Autowired
    private Car car;

    @Test
    public void testMethod(){
        this.car.run();
    }
}
