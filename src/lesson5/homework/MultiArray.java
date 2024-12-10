package lesson5.homework;

import java.util.Random;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        getSolutionTaskTwo();
    }

    public static void getSolutionTaskOneDotOne() {

        int[][] nums = new int[3][3];
        Random random = new Random();

        for (int lines = 0; lines < nums.length; lines++) {
            for (int columns = 0; columns < nums[lines].length; columns++) {
                nums[lines][columns] = random.nextInt(100);
                System.out.print(nums[lines][columns] + " ");
            }
            System.out.println();
        }
    }

    public static void getSolutionTaskOneDotTwo() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value by which you want to increase the array elements: ");
        int increaseValue = input.nextInt();

        int[][] nums = new int[3][3];
        Random random = new Random();

        for (int lines = 0; lines < nums.length; lines++) {
            for (int columns = 0; columns < nums[lines].length; columns++) {
                nums[lines][columns] = random.nextInt(100);
                System.out.print(nums[lines][columns] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------");

        for (int lines = 0; lines < nums.length; lines++) {
            for (int columns = 0; columns < nums[lines].length; columns++) {
                nums[lines][columns] += increaseValue;
                System.out.print(nums[lines][columns] + " ");
            }
            System.out.println();
        }
    }

    public static void getSolutionTaskOneDotThree() {
        int[][] nums = new int[3][3];
        Random random = new Random();
        int count = 0;

        for (int lines = 0; lines < nums.length; lines++) {
            for (int columns = 0; columns < nums[lines].length; columns++) {
                nums[lines][columns] = random.nextInt(100);
                count += nums[lines][columns];
                System.out.print(nums[lines][columns] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of all elements is equal: " + count);
    }

    public static void getSolutionTaskTwo() {
        String[][] chessBoard = new String[8][8];

        for (int lines = 0; lines < chessBoard.length; lines++) {
            for (int columns = 0; columns < chessBoard[lines].length; columns++) {
                if ((lines + columns) % 2 == 0) {
                    chessBoard[lines][columns] = "W ";
                    System.out.print(chessBoard[lines][columns] + " ");
                } else {
                    chessBoard[lines][columns] = "B ";
                    System.out.print(chessBoard[lines][columns] + " ");
                }
            }
            System.out.println();
        }
    }
}
