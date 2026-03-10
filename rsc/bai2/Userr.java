package bai2;

public class Userr implements Authenticatable {

    private String password;

    public Userr(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }
}