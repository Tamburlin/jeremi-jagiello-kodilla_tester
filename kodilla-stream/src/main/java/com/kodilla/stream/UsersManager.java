package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println("Users in Chemist group: "+ chemistGroupUsernames);
        List<User> olderUsers = filterUsersOlderThanX(43);
        System.out.println("Users older than set age: " + olderUsers);
        List<User> ActiveUsers = filterOutUsersWithZeroPost();
        System.out.println("Users that are active on forum: " + ActiveUsers);
    }

    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemist"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    private static List<User> filterUsersOlderThanX(int age) {
        List<User> users = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
        return users;
    }

    private static List<User> filterOutUsersWithZeroPost() {
        List<User> users = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getNumberOfPost() > 0)
                .collect(Collectors.toList());
        return users;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

}
