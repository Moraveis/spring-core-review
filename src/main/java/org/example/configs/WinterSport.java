package org.example.configs;

import org.example.implementation.HappyFortuneService;
import org.example.implementation.SnowboardCoach;
import org.example.interfaces.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WinterSport {

    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    @Bean
    public SnowboardCoach snowboardCoach() {
        return new SnowboardCoach(happyFortuneService());
    }
}
