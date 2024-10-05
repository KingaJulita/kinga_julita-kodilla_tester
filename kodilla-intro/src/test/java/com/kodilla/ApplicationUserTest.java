package com.kodilla;


import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApplicationUserTest {

    @Test
    public void testUserIsOlderAndTaller() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        ApplicationUser user = new ApplicationUser("John", 35, 170);
        user.check();

        System.setOut(originalOut);

        String output = outputStream.toString();
        assertTrue(output.contains("User is older than 30 and taller than 160cm"));
    }

    @Test
    public void testUserIsYoungerOrShorter() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        ApplicationUser user = new ApplicationUser("Jane", 25, 150);
        user.check();

        System.setOut(originalOut);

        String output = outputStream.toString();
        assertTrue(output.contains("User is 30 (or younger) or 160cm (or shorter)"));
    }

    @Test
    public void testUserIsOlderButShorter() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        ApplicationUser user = new ApplicationUser("Mark", 32, 150);
        user.check();

        System.setOut(originalOut);

        String output = outputStream.toString();
        assertTrue(output.contains("User is 30 (or younger) or 160cm (or shorter)"));
    }

    @Test
    public void testUserIsYoungerButTaller() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        ApplicationUser user = new ApplicationUser("Anna", 28, 165);
        user.check();

        System.setOut(originalOut);

        String output = outputStream.toString();
        assertTrue(output.contains("User is 30 (or younger) or 160cm (or shorter)"));
    }
}
