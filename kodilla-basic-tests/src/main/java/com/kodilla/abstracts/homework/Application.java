package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Shape square = new Square();
        square.getSurfaceArea();
        square.getCircumference();
        System.out.println("The area of the square is " + square.getSurfaceArea() +"and its perimeter is " + square.getCircumference());

        Trapeze trapeze = new Trapeze();
        trapeze.getSurfaceArea();
        trapeze.getCircumference();
        System.out.println("The area of the trapeze is " + trapeze.getSurfaceArea() + "and its perimeter is " + trapeze.getCircumference());
                
        Triangle triangle = new Triangle();
        triangle.getSurfaceArea();
        triangle.getCircumference();
        System.out.println("The area of the triangle is " + triangle.getSurfaceArea() + "and its perimeter is " + triangle.getCircumference());
    }
}
