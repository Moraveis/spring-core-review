package org.example.beans;

import org.example.interfaces.FortuneService;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
