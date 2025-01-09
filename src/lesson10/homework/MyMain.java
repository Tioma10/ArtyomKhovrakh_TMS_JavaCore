package lesson10.homework;

import lesson9.homework.taks1.Director;

public class MyMain {
    public static void main(String[] args) {
        User userOne = new User("victor@gmail.com", 27);
        User userTwo = new User("victor@gmail.com", 27);
        User userThree = new User("andrey27@gmail.com", 44);

        System.out.println(userOne.equals(userTwo));
        System.out.println(userThree.equals(userTwo));
        System.out.println(userOne.hashCode());
        System.out.println(userTwo.hashCode());

    }
}
