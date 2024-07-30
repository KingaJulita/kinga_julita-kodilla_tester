package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Bobby Singer"));
        teachers.add(new Teacher("Dean Winchester"));
        teachers.add(new Teacher("Donna Hanscum"));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Kevin Tran", teachers.get(0)));
        students.add(new Student("Jack Kline", teachers.get(2)));
        students.add(new Student("Rowena Macleod", null));
        students.add(new Student("Garth Fitzgerald", teachers.get(2)));
        students.add(new Student("Chuck Shurley", teachers.get(1)));
        students.add(new Student("Bela Talbot", teachers.get(0)));
        students.add(new Student("Adam Milligan", null));
        students.add(new Student("Becky Rosen", teachers.get(0)));
        students.add(new Student("Meg Masters", null));
        students.add(new Student("Jo Harvelle", teachers.get(1)));

        for (Student student : students) {


            System.out.println("Student " + student.getName() + " Teacher " +
                    Optional.ofNullable(student.getTeacher()).map(Teacher::getName).orElse("<undefined>"));
        }
    }
}
