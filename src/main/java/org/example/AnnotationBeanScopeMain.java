package org.example;

import org.example.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");

        Coach coach1 = context.getBean("tennisCoach", Coach.class);
        Coach coach2 = context.getBean("tennisCoach", Coach.class);

        boolean areEquals = coach1 == coach2;

        System.out.println(coach1);
        System.out.println(coach2);
        System.out.println("Coach instances are the same reference: " + areEquals);

        context.close();
    }
}
