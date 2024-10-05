package com.kodilla.collections.adv.maps.complex.homework;


import com.kodilla.collections.adv.maps.homework.Principal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrincipalTest {

    @Test
    public void testPrincipal() {
        Principal principal = new Principal("Alice", "Johnson");

        assertEquals("Alice", principal.getFirstname());
        assertEquals("Johnson", principal.getLastname());
    }
}
