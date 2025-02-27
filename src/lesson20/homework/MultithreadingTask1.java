package lesson20.homework;

import java.util.Arrays;
import java.util.Scanner;

public class MultithreadingTask1 {
    public static void main(String[] args) throws InterruptedException {
        int[] userArray = scan();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                min(userArray);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                max(userArray);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }

    public static int[] scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter max length of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Enter elements:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(array));

        return array;
    }

    public static void min(int[] userArray) {
        int min = userArray[0];
        for (int e : userArray) {
            if (e < min) {
                min = e;
            }
        }

        System.out.println(min);
    }

    public static void max(int[] userArray) {
        int max = userArray[0];
        for (int e : userArray) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println(max);
    }
}



