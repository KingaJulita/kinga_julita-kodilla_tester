package com.kodilla.collections.adv.maps.homework;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();
        Principal castiel = new Principal("Castiel", "Smith");
        Principal bobby = new Principal("Bobby", "Singer");
        Principal dean = new Principal("Dean", "Winchester");
        Principal jack = new Principal("Jack", "Sparrow");


        School castielSchool = new School("Drumstrang",5, List.of(30,28,30,27,32));
        School bobbySchool = new School("Eton College", 6, List.of(27,27,28,29,30,34));
        School deanSchool = new School("Beauxbaton", 12, List.of(12,15,14,14,16,16,17,12,15,18,20,10));
        School jackSchool = new School("Elite Way School", 4, List.of(16,18,14,16));


        school.put(castiel,castielSchool);
        school.put(bobby,bobbySchool);
        school.put(dean,deanSchool);
        school.put(jack,jackSchool);

        for (Map.Entry<Principal,School> principalSchoolEntry: school.entrySet()) {
            System.out.println("Dyrektor " + principalSchoolEntry.getKey().getFirstname() + " w szkole " + principalSchoolEntry.getValue().getName() + " zarządza " + principalSchoolEntry.getValue().getSizeOfClasses() +" iloscią studentów w poszczególnych klasach, łącznie " + principalSchoolEntry.getValue().getTotalStudents());
        }
    }
}
