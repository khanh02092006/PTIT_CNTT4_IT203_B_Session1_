package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Users {
    private String username;

    public Users() {
        this.username = "guest";
    }

    public Users(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new Users("khanh"));
        users.add(new Users("nam"));
        users.add(new Users("anh"));

        users.stream()
                .map(User::getUsername)
                .forEach(System.out::println);

        Supplier<User> createUser = User::new;
        User newUser = createUser.get();

        System.out.println(newUser.getUsername());
    }
}
