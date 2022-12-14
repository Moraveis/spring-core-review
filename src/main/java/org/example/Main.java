package org.example;

import org.example.implementation.HappyFortuneService;
import org.example.implementation.TrackCoach;
import org.example.interfaces.Coach;

public class Main {
    public static void main(String[] args) {

        Coach theCoach = new TrackCoach(new HappyFortuneService());
//
        System.out.println(theCoach.getDailyWorkout());
    }
}