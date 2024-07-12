package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int surfaceArea;
    private int circumference;

    public Shape(int surfaceArea, int circumference) {
        this.surfaceArea = surfaceArea;
        this.circumference = circumference;
    }

    public int getSurfaceArea() {
        return surfaceArea;
    }

    public int getCircumference() {
        return circumference;
    }
}
