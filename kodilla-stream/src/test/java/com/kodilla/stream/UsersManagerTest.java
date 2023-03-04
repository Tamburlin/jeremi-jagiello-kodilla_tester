package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {
    public static List<User> getUserList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemist"));
        users.add(new User("Jessy Pinkman", 25,4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2,"Chemist"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        return users;
    }
    public static List<String> getChemistsList() {
        List<String> chemistsList = new ArrayList<>();
        chemistsList.add(new String("Walter White"));
        chemistsList.add(new String("Gale Boetticher"));
        return chemistsList;
    }

    @Test
    public void shouldFilterToOnlyChemistsAndBeEqual() {
        List<String> usernames = UsersManagerTest.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemist"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        assertEquals(getChemistsList(),usernames );

    }

    @Test
    public void shouldFilterOnlyUsersOlderThan43() { //for example x = 43
        List<User> users = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() > 43 )
                .collect(Collectors.toList()); //should collect 4 users - Walter, Gus, Gale and Mike
        int i =0;
        for(User user : users) {
            if(user.getAge() > 43 )
                i += 1;
        }
        assertEquals(4,i);
    }

    @Test
    public void shouldFilterOutUsersWithZeroPost() {
        List<User> users = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getNumberOfPost() > 0)
                .collect(Collectors.toList()); //should collect 4 users
        assertEquals(4, users.size());
    }
}