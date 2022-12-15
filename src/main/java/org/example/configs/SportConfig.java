package org.example.configs;

import org.example.implementation.SadFortuneService;
import org.example.implementation.SwinCoach;
import org.example.interfaces.Coach;
import org.example.interfaces.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value = "org.example")
@PropertySource(value = "sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwinCoach(sadFortuneService());
    }
}
