package org.example.implementation;

import org.example.interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class CloneFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You better win. by HappyFortuneService";
    }
}
