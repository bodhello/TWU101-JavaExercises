package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private String name;
    private int hitPoints;

    public Troll(){
        this.name = "Troll";
        this.hitPoints = 40;
    }

    @Override
    public void reportStatus() {
        System.out.println("Name: " + this.name + ", Current HP: " + hitPoints);
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints = hitPoints - (amount / 2);
    }
}
