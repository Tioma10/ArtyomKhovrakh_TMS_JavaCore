package lesson4.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArrays {
    public static void main(String[] args) {


    }

    public static void getSolutionTaskOne() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int length = input.nextInt();
        int[] nums = new int[length];

        Random random = new Random();

        for (int index = 0; index < length; index++) {
            nums[index] = random.nextInt(100);
            System.out.print(nums[index] + " ");
        }

        System.out.println(" ");


        for (int index = length - 1; index >= 0; index--) {
            System.out.print(nums[index] + " ");
        }

    }

    public static void getSolutionTaskTwo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int length = input.nextInt();
        int[] nums = new int[length];

        Random random = new Random();

        for (int num = 0; num < length; num++) {
            nums[num] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(nums));

        int minValue = nums[0];
        int maxValue = nums[0];

        for (int num : nums) {
            if (num < minValue) {
                minValue = num;
            }
            if (num > maxValue) {
                maxValue = num;
            }
        }
        System.out.println("Min value in array is: " + minValue + "\nMax value in array is: " + maxValue);

    }

    public static void getSolutionTaskThree() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int length = input.nextInt();
        int[] nums = new int[length];

        for (int num = 0; num < length; num++) {
            System.out.print("Enter the array integer item " + num + ": ");
            nums[num] = input.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        int minValueIndex = 0;
        int maxValueIndex = 0;

        for (int index = 1; index < length; index++) {
            if (nums[index] < nums[minValueIndex]) {
                minValueIndex = index;
            }

            if (nums[index] > nums[maxValueIndex]) {
                maxValueIndex = index;
            }
        }

        System.out.println("Index of min value in array is: " + minValueIndex + "\nIndex of max value in array is: " +
                maxValueIndex);

    }

    public static void getSolutionTaskFour() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int length = input.nextInt();
        int[] nums = new int[length];

        for (int num = 0; num < length; num++) {
            System.out.print("Enter the array integer item " + num + ": ");
            nums[num] = input.nextInt();
        }

        int count = 0;

        for (int num : nums) {
            if (num == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("There are no zeros in a missive");
        } else {
            System.out.println("The number of zeros in the array: " + count);
        }
    }

    public static void getSolutionTaskFive() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int length = input.nextInt();
        int[] nums = new int[length];

        for (int num = 0; num < length; num++) {
            System.out.print("Enter the array integer item " + num + ": ");
            nums[num] = input.nextInt();
        }

        for (int index = 0; index < length / 2; index++) {

            int buffer = nums[index];
            nums[index] = nums[length - index - 1];
            nums[length - index - 1] = buffer;
        }

        System.out.println(Arrays.toString(nums));

    }


    public static void getSolutionTaskSix() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int length = input.nextInt();
        int[] nums = new int[length];

        for (int num = 0; num < length; num++) {
            System.out.print("Enter the array integer item " + num + ": ");
            nums[num] = input.nextInt();
        }

        for (int index = 0; index < length - 1; index++) {
            if (nums[index] >= nums[index + 1]) {
                System.out.println("Array is non-increasing sequence");
                return;
            }
        }

        System.out.println("Array is an increasing sequence");


    }
}
