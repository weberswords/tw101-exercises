package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Quits on 7/15/17.
 */
public class Troll implements Monster {
    String name = "Troll";
    int hitPoints = 40;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHitPoints() {
        return this.hitPoints;
    }

    @Override
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void takeDamage(int amount) {
        amount = amount/2;
        hitPoints -= amount;
    }
    @Override
    public String reportStatus() {
        String nameForReport = getName();
        int hitPointsForReport = getHitPoints();
        String reportStatus = null;
        reportStatus = reportStatus.format("%s: %d HP remaining \n", nameForReport, hitPointsForReport);
        return reportStatus;
    }
}
