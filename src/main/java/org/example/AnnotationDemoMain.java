package org.example;

import org.example.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationDemoMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");

        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        System.out.println(tennisCoach.getDailyWorkout());

        Coach badmintonCoach = context.getBean("badmintonCoach", Coach.class);
        System.out.println(badmintonCoach.getDailyWorkout());

        context.close();
    }
}
