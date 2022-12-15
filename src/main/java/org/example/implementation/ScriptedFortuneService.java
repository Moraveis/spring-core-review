package org.example.implementation;

import org.example.interfaces.FortuneService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ScriptedFortuneService implements FortuneService {

    private List<String> fortunes = new ArrayList<>();

    @PostConstruct
    public void loadFortunesFromFile() {
        System.out.println("ScriptedFortuneService:loadFortunesFromFile loading fortunes");
        ClassLoader classLoader = getClass().getClassLoader();

        File file = new File(classLoader.getResource("scripted-fortunes.txt").getFile());
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.lines().forEach(fortunes::add);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getFortune() {
        Random random = new Random();
        return fortunes.get(random.nextInt(fortunes.size()));
    }


}
