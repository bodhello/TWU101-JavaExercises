package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private int value;

    public Accumulator() {
        value = 0;
    }

    void increment(){
        ++value;
    }

    void total(){
        System.out.println(value);
    }
}
