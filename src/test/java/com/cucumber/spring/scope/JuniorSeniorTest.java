package com.cucumber.spring.scope;

import com.cucumber.spring.SpringSeleniumTestNG;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class JuniorSeniorTest extends SpringSeleniumTestNG {

    @Autowired
    private JuniorEngg juniorEngg;


    @Autowired
    private SeniorEngg seniorEngg;


    @Test
    public void checkSalary(){

        this.juniorEngg.getSalary().setAmount(200);
        System.out.println(this.juniorEngg.getSalary().getAmount());
        this.seniorEngg.getSalary().setAmount(400);
        System.out.println(this.seniorEngg.getSalary().getAmount());
        System.out.println(this.juniorEngg.getSalary().getAmount());
    }
}
