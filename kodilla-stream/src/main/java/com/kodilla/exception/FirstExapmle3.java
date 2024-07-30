package com.kodilla.exception;

public class FirstExapmle3 {
    public static void main(String[] args) {
        String username = "John";
        String[] nameParts = username.split(" ");
        System.out.println("Firstname: " + nameParts[0]);
        System.out.println("Lastname: " + nameParts[1]);
    }
}
