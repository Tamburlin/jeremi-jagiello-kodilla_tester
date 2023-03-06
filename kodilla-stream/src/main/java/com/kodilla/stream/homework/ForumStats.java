package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println(getAvgOfPostFromUsersOlderThan40(UsersRepository.getUserList()));
        System.out.println(getAvgOfPostFromUsersYoungerThan43(UsersRepository.getUserList()));
    }
    public static double getAvgOfPostFromUsersOlderThan40(List<User> usernames) {
        double avgPost = usernames
                .stream()
                .filter(user -> user.getAge() > 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average().getAsDouble();
        return avgPost;
    }
    public static double getAvgOfPostFromUsersYoungerThan43(List<User> usernames) {
        double avgPost = usernames
                .stream()
                .filter(user -> user.getAge() <= 43)
                .mapToInt(n -> n.getNumberOfPost())
                .average().getAsDouble();
        return avgPost;
    }
}
