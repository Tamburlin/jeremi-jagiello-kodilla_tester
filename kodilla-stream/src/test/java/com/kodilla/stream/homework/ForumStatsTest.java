package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    public static List<User> testList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 44, 20, "Chemist"));
        users.add(new User("Jessy Pinkman", 44,30, "Sales"));
        users.add(new User("Tuco Salamanca", 44, 10, "Manager"));
        users.add(new User("Gus Firing", 44, 20, "Board"));
        users.add(new User("Gale Boetticher", 39, 20,"Chemist"));
        users.add(new User("Mike Ehrmantraut", 39, 10, "Security"));
        return users;
    }
    public static List<User> testList2() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 44, 0, "Chemist"));
        users.add(new User("Jessy Pinkman", 44,0, "Sales"));
        users.add(new User("Tuco Salamanca", 39, -1, "Manager"));
        users.add(new User("Gus Firing", 39, -6, "Board"));
        return users;
    }

    @Test
    public void shouldGiveAveragePostOfUsersOlderThan40() {
        assertEquals(20, ForumStats.getAvgOfPostFromUsersOlderThan40(ForumStatsTest.testList()), 0.001);
    }
    @Test
    public void shouldGiveAveragePostOfUsersYoungerThan43() {
        assertEquals(15, ForumStats.getAvgOfPostFromUsersYoungerThan43(ForumStatsTest.testList()),0.001);
    }
    @Test
    public void shouldGiveAveragePostOfUsersOlderThan40EvenWithIntEqual0() {
        assertEquals(0,ForumStats.getAvgOfPostFromUsersOlderThan40(ForumStatsTest.testList2()),0.001);
    }
    @Test
    public void shouldGiveAveragePostOfUsersYoungerThan43EvenWithIntBelow0() {
        assertEquals(-3.5,ForumStats.getAvgOfPostFromUsersYoungerThan43(ForumStatsTest.testList2()),0.001);
    }

}