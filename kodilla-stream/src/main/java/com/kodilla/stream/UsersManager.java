package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<String> userOlderThan = filterUserOlderThan(35);
        System.out.println(userOlderThan);

        List<Integer> chemistGroupAge = filterChemistGroupAge();
        System.out.println(chemistGroupAge);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    public static List<String> filterUserOlderThan (int age) {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .map(UsersManager :: getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static List<Integer> filterChemistGroupAge() {
        List<Integer> userage = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager :: getUserAge)
                .collect(Collectors.toList());

        return userage;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static int getUserAge( User user) {
        return user.getAge();
    }
}