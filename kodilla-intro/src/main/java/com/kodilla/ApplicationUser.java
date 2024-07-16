package com.kodilla;

public class ApplicationUser {
   private String name;
   private int age;
   private int height;

    public ApplicationUser(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void check(){

        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
