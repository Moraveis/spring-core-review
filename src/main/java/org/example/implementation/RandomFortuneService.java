package org.example.implementation;

import org.example.interfaces.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] fortunes = {"Bad lucky", "This is Fine", "Oh Yeah, you Rock!"};
    private final Random random = new Random();

    public void setFortunes(String[] fortunes) {
        this.fortunes = fortunes;
    }

    @Override
    public String getFortune() {
        return fortunes[random.nextInt(fortunes.length)];
    }
}
