package org.example.implementation;

import org.example.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Badminton stuff";
    }

    @Override
    public String getDailyFortune() {
        return "You better win.";
    }
}
