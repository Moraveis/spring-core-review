package org.example;

import org.example.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        Coach trackCoach = context.getBean("coach", Coach.class);
        Coach backupTrackCoach = context.getBean("coach", Coach.class);
        boolean areSameInstance = (trackCoach == backupTrackCoach);
        System.out.println("Track Coaches are equals ? " + areSameInstance);

        Coach soccerCoach = context.getBean("anotherCoach", Coach.class);
        Coach backupSoccerCoach = context.getBean("anotherCoach", Coach.class);
        areSameInstance = (soccerCoach == backupSoccerCoach);
        System.out.println("Soccer Coaches are equals ? " + areSameInstance);

    }
}
