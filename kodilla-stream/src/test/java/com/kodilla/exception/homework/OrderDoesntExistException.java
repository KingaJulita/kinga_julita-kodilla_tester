package com.kodilla.exception.homework;

public class OrderDoesntExistException extends Exception {
    public OrderDoesntExistException (String massage) {
        super(massage);
    }
}
