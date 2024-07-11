package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Operating system turn on.");
    }

    public void turnOff() {
        System.out.println("Operating system turn off.");
    }

    public int getYear() {
        return year;
    }

    public void displayYearOfOperatingSystem() {
        System.out.println("Year of operating system is " + year);
    }
}
