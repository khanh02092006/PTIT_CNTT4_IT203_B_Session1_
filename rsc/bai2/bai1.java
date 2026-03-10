package bai2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class bai1 {
    static void main(String[] args) {
        Predicate<User> isAdmin = user -> user.getRole().equals("ADMIN"); // kiếm tra nội dung có giống nhau không
        Function<User,String> getUsername = user -> user.getUsername();
        Consumer<User> printUser =user -> System.out.println(user);
        Supplier<User> createUser = () -> new User("guest", "USER");
        User user1 = new User("khanh", "ADMIN");
        User user2 = createUser.get();
        System.out.println("Is Admin: " + isAdmin.test(user1));
        System.out.println("Username: " + getUsername.apply(user1));

        printUser.accept(user1);
        printUser.accept(user2);
    }
}
