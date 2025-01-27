package lesson11.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {

        getSolutionTaskOne();
        getSolutionTaskTwo();
        getSolutionTaskThree();
        getSolutionTaskFive();

    }

    public static void getSolutionTaskOne() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String firstString = input.nextLine();
        System.out.println("Enter second string: ");
        String secondString = input.nextLine();
        System.out.println("Enter third string: ");
        String thirdString = input.nextLine();

        String[] inputStrings = new String[]{firstString, secondString, thirdString};

        int maxStringLength = inputStrings[0].length();
        int minStringLength = inputStrings[0].length();
        String maxString = inputStrings[0];
        String minString = inputStrings[0];

        for (int index = 1; index < inputStrings.length; index++) {
            if (inputStrings[index].length() > maxStringLength) {
                maxStringLength = inputStrings[index].length();
                maxString = inputStrings[index];

            }

            if (inputStrings[index].length() < minStringLength) {
                minStringLength = inputStrings[index].length();
                minString = inputStrings[index];

            }
        }

        System.out.println("The longest string is: " + maxString + ". With length: " + maxStringLength);
        System.out.println("The shortest string is: " + minString + ". With length: " + minStringLength);
    }

    public static void getSolutionTaskTwo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String firstString = input.nextLine();
        System.out.println("Enter second string: ");
        String secondString = input.nextLine();
        System.out.println("Enter third string: ");
        String thirdString = input.nextLine();

        String[] inputStrings = new String[]{firstString, secondString, thirdString};
        Arrays.sort(inputStrings, Comparator.comparingInt(String::length));
        for (String el : inputStrings) {
            System.out.print("\"" + el + "\" " + "with length: " + el.length() + " ");
        }
    }

    public static void getSolutionTaskThree() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String firstString = input.nextLine();
        System.out.println("Enter second string: ");
        String secondString = input.nextLine();
        System.out.println("Enter third string: ");
        String thirdString = input.nextLine();

        String[] inputStrings = new String[]{firstString, secondString, thirdString};

        int midLength = (firstString.length() + secondString.length() + thirdString.length()) / 3;

        for (int index = 0; index < inputStrings.length; index++) {
            if (inputStrings[index].length() < midLength) {
                System.out.print("\"" + inputStrings[index] + "\" " + "with length: " + inputStrings[index].length()
                        + " ");
            }
        }
    }


    public static void getSolutionTaskFive() {
        String stringOne = "Hello";
        char[] arrayStringOne = stringOne.toCharArray();
        StringBuilder stringTwo = new StringBuilder();

        for (char el : arrayStringOne) {
            stringTwo.append(el);
            stringTwo.append(el);
        }

        System.out.print(stringTwo);

    }
}

