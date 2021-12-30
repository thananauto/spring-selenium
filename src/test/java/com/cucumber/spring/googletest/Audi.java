package com.cucumber.spring.googletest;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("audi")
public class Audi implements Car{
    @Override
    public void run() {
        System.out.println("Audi car");
    }
}
