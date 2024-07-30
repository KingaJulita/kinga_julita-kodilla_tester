package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsername() {
        // given
        List<User> users = UsersRepository.getUsersList();
        // when
        List<String> chemistGroupUsernames = UsersManager.filterChemistGroupUsernames();
        // then
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gale Boetticher");
        assertEquals(expectedList,chemistGroupUsernames);
    }

    @Test
    public void testFilterUserOlderThan() {
        // given
        List<User> users = UsersRepository.getUsersList();
        // when
        List<String> userOlderThan = UsersManager.filterUserOlderThan(35);
        // then
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gus Firing");
        expectedList.add("Gale Boetticher");
        expectedList.add("Mike Ehrmantraut");
        assertEquals(expectedList,userOlderThan);
    }

    @Test
    public void testFilterChemistsGroupAge() {
        // given
        List<User> users = UsersRepository.getUsersList();
        // when
        List<Integer> chemistGroupAge = UsersManager.filterChemistGroupAge();
        // then
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(50);
        expectedList.add(44);
        assertEquals(expectedList,chemistGroupAge);
    }


}