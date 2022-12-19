package com.example.spring_springboot.mydepedencies;

import org.springframework.stereotype.Component;

@Component
public class MyRudeDependency implements MyDependency {
    @Override
    public String textPrint() {
        return "siema";
    }
}
