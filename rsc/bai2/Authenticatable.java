package bai2;

@FunctionalInterface
public interface Authenticatable {

    // 1. phương thức trừu tượng
    String getPassword();

    // 2. default method kiểm tra mật khẩu có rỗng không
    default boolean isAuthenticated() {
        return getPassword() != null && !getPassword().isEmpty();
    }

    // 3. static method mô phỏng mã hóa mật khẩu
    static String encrypt(String rawPassword) {
        return "ENC_" + rawPassword;
    }
}