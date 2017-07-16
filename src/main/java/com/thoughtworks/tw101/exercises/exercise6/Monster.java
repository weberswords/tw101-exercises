package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Quits on 7/15/17.
 */
public interface Monster {

    String getName();
    int getHitPoints();
    void setHitPoints(int hitPoints);
    void setName(String name);
    String reportStatus();
    void takeDamage(int amount);
}
