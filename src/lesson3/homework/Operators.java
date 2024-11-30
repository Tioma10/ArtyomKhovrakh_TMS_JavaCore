package lesson3.homework;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        getSolutionTaskOne();

    }

    public static void getSolutionTaskOne() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }


    }

    public static void getSolutionTaskTwo() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the outside temperature: ");
        int outsideTemperature = input.nextInt();

        if (outsideTemperature > -5) {
            System.out.println("Warm");
        } else if (outsideTemperature <= -20) {
            System.out.println("Cold");
        } else {
            System.out.println("Normal");
        }

    }

    public static void getSolutionTaskThree() {

        for (int curNumber = 1; curNumber <= 20; curNumber++) {
            System.out.print(curNumber * curNumber + " ");
        }

    }

    public static void getSolutionTaskFour() {

        int curNumber = 0;
        while (curNumber != 98) {

            curNumber += 7;
            System.out.print(curNumber + " ");
        }
    }

    public static void getSolutionTaskWithStar(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive integer number: ");
        int enteredNumber = input.nextInt();
        if (enteredNumber>0)
        {
            int sum= 0;
            for (int changeableValue = 1; changeableValue < enteredNumber; changeableValue++){
                sum += changeableValue;
                System.out.print(sum + " ");
            }
        }
        else
        {
            System.out.println("This value is not positive or zero");
        }

    }

}
