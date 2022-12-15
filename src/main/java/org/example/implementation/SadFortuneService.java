package org.example.implementation;

import org.example.interfaces.FortuneService;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Not your day.";
    }
}
