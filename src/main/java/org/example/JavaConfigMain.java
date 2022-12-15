package org.example;

import org.example.configs.SportConfig;
import org.example.implementation.SwinCoach;
import org.example.interfaces.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach actingCoach = context.getBean("actCoach", Coach.class);
        System.out.println(actingCoach.getDailyWorkout());
        System.out.println(actingCoach.getDailyFortune());

        SwinCoach swimCoach = context.getBean("swimCoach", SwinCoach.class);
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());
        System.out.println(swimCoach.getEmail());
        System.out.println(swimCoach.getTeam());

        context.close();
    }
}
