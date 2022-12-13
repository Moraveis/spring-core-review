package org.example;

import org.example.beans.HappyFortuneService;
import org.example.beans.TrackCoach;
import org.example.interfaces.Coach;

public class Main {
    public static void main(String[] args) {

        Coach theCoach = new TrackCoach(new HappyFortuneService());
//
        System.out.println(theCoach.getDailyWorkout());
    }
}