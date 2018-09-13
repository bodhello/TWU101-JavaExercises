package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    private String name;
    private int hitPoints;

    public Orc(){
        this.name = "Orc";
        this.hitPoints = 20;
    }

    @Override
    public void reportStatus() {
        System.out.println("Name: " + this.name + ", Current HP: " + hitPoints);
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints = hitPoints - amount;
    }
}
