package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {


       public static double averagePostOfUserAboveOrEqual40 (List<User> users) {
           return users.stream()
                   .filter(user -> user.getAge() >= 40)
                   .mapToDouble(User::getNumberOfPost)
                   .average()
                   .orElse(0.0);
    }

    public static double averagePostOfUserBelow40 (List<User> users) {
           return users.stream()
                   .filter(user -> user.getAge() < 40)
                   .mapToDouble(User::getNumberOfPost)
                   .average()
                   .orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        double averagePostOfUserAboveOrEqual40 = averagePostOfUserAboveOrEqual40(users);
        double averagePostOfUserBelow40 = averagePostOfUserBelow40(users);

        System.out.println("Average post of user below 40 is " + averagePostOfUserBelow40);
        System.out.println("Average post of user above or equal 40 is " + averagePostOfUserAboveOrEqual40);
    }
}
