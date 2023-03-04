package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        List<User> olderUsers = filterUsersOlderThanX(43);
        System.out.println(olderUsers);
    }

    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemist"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }
    public static String getUserName(User user) {
        return user.getUsername();
    }
    private static List<User> filterUsersOlderThanX(int age) {
        List<User> users = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() >= age)
                .collect(Collectors.toList());
        return users;
    }
}
