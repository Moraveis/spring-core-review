package org.example.implementation;

import org.example.interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Your fortune today is... keep working bro";
    }
}
