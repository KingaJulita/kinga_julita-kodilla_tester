package com.kodilla.collections.adv.immutable.homework;

public class Task {
    protected String title;
    protected int duration;

    public Task(int duration, String title) {
        this.duration = duration;
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }
}
