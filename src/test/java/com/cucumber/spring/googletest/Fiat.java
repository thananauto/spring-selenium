package com.cucumber.spring.googletest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@Qualifier("fiat")
public class Fiat implements  Car{


    @Override
    public void run() {
        System.out.println("Fiat class");
    }


}
