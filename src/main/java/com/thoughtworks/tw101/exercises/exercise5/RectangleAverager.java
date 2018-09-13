package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int sum = 0;
        for (int i = 0; i < rectangles.length; ++i) {
            sum += rectangles[i].area();
        }
        return (float) sum / rectangles.length;
    }
}
