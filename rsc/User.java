public class User {

    private int age;

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Tuổi không hợp lệ! Tuổi phải từ 0 đến 120.");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}