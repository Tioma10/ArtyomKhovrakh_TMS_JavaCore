package lesson20.homework;

import java.util.Arrays;

public class MultithreadingTask2 {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[]{2, 1, 3, 5, 4, 6};

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bubbleSort(array);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                selectionSort(array);
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                insertionSort(array);
            }
        });

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

        for (int a : array) {
            System.out.println(a);
        }

        System.out.println("-----------");

    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
        }

        for (int a : array) {
            System.out.println(a);
        }

        System.out.println("-----------");
    }

    public static void insertionSort(int[] array) {
        int j;
        for (int i = 1; i < array.length; i++) {

            int swap = array[i];
            for (j = i; j > 0 && swap < array[j - 1]; j--) {

                array[j] = array[j - 1];
            }
            array[j] = swap;
        }

        for (int a : array) {
            System.out.println(a);
        }

        System.out.println("-----------");
    }
}
