package org.example.beans;

import org.example.interfaces.FortuneService;

import java.util.Random;

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
