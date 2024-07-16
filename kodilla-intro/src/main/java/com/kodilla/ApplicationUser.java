package com.kodilla;

public class ApplicationUser {
    private String name;
    private double age;
    private int height;

    public ApplicationUser(String name, double age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Object check() {

        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
        return null;
    }
}
