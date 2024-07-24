package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        BookRecord bookRecord = new BookRecord("test", "testowa pozycja", 2022);

        // Wyświetlanie informacji o książce
        System.out.println("Author: " + bookRecord.author());
        System.out.println("Title: " + bookRecord.title());
        System.out.println("Year: " + bookRecord.year());
    }
}
