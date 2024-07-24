package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private int numberOfClasses;
    private List<Integer> sizeOfClasses = new ArrayList<>();

    public School(String name,int numberOfClasses, List<Integer> sizeOfClasses) {
        this.name = name;
        this.numberOfClasses = numberOfClasses;
        this.sizeOfClasses = sizeOfClasses;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public List<Integer> getSizeOfClasses() {
        return sizeOfClasses;
    }

    public int getTotalStudents() {
        int total = 0;
        for (int size : sizeOfClasses) {
            total += size;
        }
        return total;
    }
}