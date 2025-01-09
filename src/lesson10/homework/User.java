package lesson10.homework;

public class User {
    private final String email;
    private final int age;

    public User( String email, int age) {
        this.email = email;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null|| getClass() != obj.getClass()){
            return false;
        }
        User user = (User) obj;
        return age == user.age && email.equals(user.email);

    }

    @Override
    public String toString() {
        return "User: \n" +
                "\t Email: " + email +
                "\t Age: " + age;
    }
}
