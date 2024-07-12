package com.kodilla.abstracts.homework;

public class Person {
    private int firstname;
    private int age;
    private int job;

    public Person (int firstname, int age, int job) {
        this.firstname = firstname;
        this.age = age;
        this.job = job;
    }
    public int getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public int getJob() {
        return job;
    }

    public static void main(String[] args) {

        Blacksmith blacksmith = new Blacksmith();
        blacksmith.getResponsibilities();
        System.out.println("Blacksmith responsibilities is " + blacksmith.getResponsibilities());

        Confectioner confectioner = new Confectioner();
        confectioner.getResponsibilities();
        System.out.println("Confectioner responsibilities is " + confectioner.getResponsibilities());

        Furrier furrier = new Furrier();
        furrier.getResponsibilities();
        System.out.println("Furrier responsibilities is " + furrier.getResponsibilities());

        Roofer roofer = new Roofer();
        roofer.getResponsibilities();
        System.out.println("Roofer responsibilities is " + roofer.getResponsibilities());
    }
}
