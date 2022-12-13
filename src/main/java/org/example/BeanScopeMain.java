package org.example;

import org.example.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach coach = context.getBean("coach", Coach.class);
        Coach anotherCoach = context.getBean("coach", Coach.class);

        boolean areEquals = (coach == anotherCoach);

        System.out.println("Variables have the same reference: " + areEquals);
        System.out.println(coach);
        System.out.println(anotherCoach);
    }
}
