package com.example.spring_springboot.mydepedencies;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MyPoliteDependency implements MyDependency {
    @Override
    public String textPrint() {
        return "Dzien dobry";
    }
}
