package lesson2.homework;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Locale;
import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        getSolutionTaskOne();
    }

    public static void getSolutionTaskOne() {
        int b = 2;
        int c = 3;
        int a = 4 * (b + c - 1) / 2;
        System.out.println(a);
    }

    public static void getSolutionTaskTwo() {
        int n = 26;
        int wholePart = n / 10;
        int remainder = n % 10;
        int result = wholePart + remainder;
        System.out.println(result);
    }

    public static void getSolutionTaskThree() {
        int n = 126;
        int wholePart1 = n / 100;
        int remainder1 = n % 100;
        int wholePart2 = remainder1 / 10;
        int remainder2 = n % 10;
        int result = wholePart1 + wholePart2 + remainder2;
        System.out.println(result);

    }

    public static void getSolutionTaskFour() {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter any double number: ");
        double n = input.nextDouble();

        int customInteger = (int) n;
        double result = n - customInteger;

        if (result < 0.5) {
            System.out.println(customInteger);
        } else {
            System.out.println(++customInteger);
        }

    }

    public static void getSolutionTaskFive() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int wholePart = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        System.out.println("Answer: " + wholePart + " with remainder " + remainder);

    }

    public static void getSolutionTaskWithStarOne() {
        int a = 8;
        int b = 6;
        int buffer = b - a;

        a += buffer;
        b -= buffer;

        System.out.println(a);
        System.out.println(b);
    }

    public static void getSolutionTaskWithStarTwo() {
        int a = 8;
        int b = 6;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

    }


}

