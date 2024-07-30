package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTestSuite {


    @Test
    public void testAveragePostOfUserAboveOrEqual40() {

        // given
        List<User> users = UsersRepository.getUsersList();

        // when
        double average = ForumStats.averagePostOfUserAboveOrEqual40(users);

        // then
        assertEquals(2.25, average);
    }

    @Test
    public void testAveragePostOfUserBelow40() {

        // given
        List<User> users = UsersRepository.getUsersList();

        // when
        double average = ForumStats.averagePostOfUserBelow40(users);

        // then
        assertEquals(2382, average);
    }
}