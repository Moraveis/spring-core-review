package org.example;

import org.example.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationDemoMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");

        // Constructor injection
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        // Setter injection
        Coach badmintonCoach = context.getBean("badmintonCoach", Coach.class);
        System.out.println(badmintonCoach.getDailyWorkout());
        System.out.println(badmintonCoach.getDailyFortune());

        // Field Injection + Qualifier
        Coach chessCoach = context.getBean("chessCoach", Coach.class);
        System.out.println(chessCoach.getDailyWorkout());
        System.out.println(chessCoach.getDailyFortune());

        // Exercise
        Coach actingCoach = context.getBean("actCoach", Coach.class);
        System.out.println(actingCoach.getDailyWorkout());
        System.out.println(actingCoach.getDailyFortune());

        context.close();
    }
}
