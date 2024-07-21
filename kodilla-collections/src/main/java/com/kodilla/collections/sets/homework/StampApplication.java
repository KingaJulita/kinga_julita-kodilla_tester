package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();



        stamps.add(new Stamp( "Poczta lotnicza", 5, 5, true ));
        stamps.add(new Stamp("Poczta balonowa", 10, 10, true));
        stamps.add(new Stamp("Poczta sterowcowa", 10, 10, false));
        stamps.add(new Stamp("Poczta szybowcowa", 15, 10, true));
        stamps.add(new Stamp("Poczta lotnicza", 5, 5 , true));


        System.out.println(stamps.size());
        for (Stamp stamp: stamps)
            System.out.println(stamp);
    }
}
