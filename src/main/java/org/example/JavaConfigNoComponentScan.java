package org.example;

import org.example.configs.WinterSport;
import org.example.interfaces.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigNoComponentScan {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WinterSport.class);

        Coach snowboardCoach = context.getBean("snowboardCoach", Coach.class);
        System.out.println(snowboardCoach.getDailyWorkout());
        System.out.println(snowboardCoach.getDailyFortune());

        context.close();
    }
}
