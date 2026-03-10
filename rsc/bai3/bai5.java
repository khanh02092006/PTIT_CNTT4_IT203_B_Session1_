package bai3;

import java.util.*;

public class bai5 {

    record User(String username, String email, String status) {}

    public static void main(String[] args) {

        List<User> users = List.of(
                new User("alexander", "a@gmail.com", "ACTIVE"),
                new User("bob", "b@gmail.com", "INACTIVE"),
                new User("charlotte", "c@gmail.com", "ACTIVE"),
                new User("Benjamin", "d@gmail.com", "ACTIVE"),
                new User("anna", "e@gmail.com", "ACTIVE")
        );

        users.stream()
                .sorted((u1, u2) -> Integer.compare(u2.username().length(), u1.username().length()))
                .limit(3)
                .forEach(user -> System.out.println(user.username()));
    }
}
