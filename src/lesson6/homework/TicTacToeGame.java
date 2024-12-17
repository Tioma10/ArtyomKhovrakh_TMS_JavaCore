package lesson6.homework;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        startGame();
    }

    // Starts the game
    public static void startGame() {
        while (true) {
            getInitialMessage();


            if ((getInputValue().nextLine()).equals("y")) {
                System.out.println("----------------------------------------------------------------------------------------");

                char[][] gameTable = createInitializeTable();
                char sign = 'X';


                int dice = getRandomNumbers().nextInt(0, 2);
                while (checkStatus(gameTable)) {
                    drawTable(gameTable);
                    if (dice % 2 == 0) {
                        makePlayerMove(gameTable, sign);
                    } else {
                        makeAIMove(gameTable, sign);
                    }

                    if (sign == 'X') {
                        sign = '0';
                    } else {
                        sign = 'X';
                    }
                    dice++;
                }

            } else {
                System.out.println("\u001B[31m\t" + "You have decided to leave the game. GOODBYE!" + "\u001B[0m");
            }
        }
    }

    // Create game's table
    public static char[][] createInitializeTable() {
        return new char[][]{
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'}
        };
    }

    // Get initial message
    public static void getInitialMessage() {
        System.out.println("\u001B[34m\t");
        System.out.println("-------------------------------WELCOME TO TIC-TAC-TOE GAME------------------------------");
        System.out.println("This is the instruction:");
        System.out.println("\tThe game will draw a table.");
        System.out.println("\tAfter it decides who starts the first.");
        System.out.println("\tIf a player starts the game - X.");
        System.out.println("\tIf a AI starts the game, the player will use - O.");
        System.out.print("Would you like to move on?! (y - Yes, the rest - No: " + "\u001B[0m");
    }

    // Draws the table
    public static void drawTable(char[][] gameTable) {
        System.out.println("\u001B[32m");
        for (char[] outer : gameTable) {
            for (char inner : outer) {
                System.out.print("\t" + inner + "  ");
            }
            System.out.println();
        }
        System.out.println("\u001B[0m");
    }

    // Make AI move
    public static void makeAIMove(char[][] gameTable, char sign) {

        int cellAI = getRandomNumbers().nextInt(0, 3);
        int columnAI = getRandomNumbers().nextInt(0, 3);

        while (gameTable[cellAI][columnAI] != '*') {

            cellAI = getRandomNumbers().nextInt(0, 3);
            columnAI = getRandomNumbers().nextInt(0, 3);
        }
        System.out.println("AI has decided to make the following move: [" +
                (cellAI + 1) + "][" + (columnAI + 1) + "].");
        gameTable[cellAI][columnAI] = sign;
    }


    public static void makePlayerMove(char[][] gameTable, char sign) {

        while (true) {
            System.out.print("Please, enter coordinates cell (1-3): ");
            int cellPlayer = getInputValue().nextInt();
            System.out.print("Please, enter coordinates column (1-3): ");
            int columnPlayer = getInputValue().nextInt();

            if (cellPlayer >= 1 && cellPlayer <= 3 && columnPlayer >= 1 && columnPlayer <= 3 && gameTable[cellPlayer - 1]
                    [columnPlayer - 1] == '*') {
                System.out.println("The player have decided to put a value: [" +
                        cellPlayer + "][" + columnPlayer + "].");
                gameTable[cellPlayer - 1][columnPlayer - 1] = sign;
                break;
            }
            System.out.println("\u001B[31m\t");
            System.out.println("YOU HAVE ENTERED A WRONG VALUE. PLEASE, CHECK ACCESSIBLE COORDINATES AND RE-ENTER.");
            System.out.println("\u001B[0m");
        }
    }


    public static boolean checkStatus(char[][] gameTable) {
        int count = 0;
        for (int lines = 0; lines < gameTable.length; lines++) {
            for (int columns = 0; columns < gameTable[lines].length; columns++) {
                if (gameTable[columns][lines] != '*') {
                    count++;
                }
                if (gameTable[columns][0] == gameTable[columns][1] && gameTable[columns][0] == gameTable[columns][2] &&
                        gameTable[columns][0] != '*' && gameTable[columns][1] != '*' && gameTable[columns][2] != '*') {
                    System.out.println("Won");
                    return false;
                }
                if (gameTable[0][lines] == gameTable[1][lines] && gameTable[0][lines] == gameTable[2][lines] &&
                        gameTable[0][lines] != '*' && gameTable[1][lines] != '*' && gameTable[2][lines]!= '*') {
                    System.out.println("Won");
                    return false;
                }
                if (gameTable[0][0] == gameTable[1][1] && gameTable[0][0] == gameTable[2][2] &&
                        gameTable[0][0] != '*' && gameTable[1][1] != '*' && gameTable[2][2]!= '*') {
                    System.out.println("Won");
                    return false;
                }
                if (gameTable[2][0] == gameTable[1][1] && gameTable[1][1] == gameTable[0][2] &&
                        gameTable[2][0] != '*' && gameTable[1][1] != '*' && gameTable[0][2]!= '*') {
                    System.out.println("Won");
                    return false;
                }
            }
        }

        if (count > 7) {
            System.out.println("Draw");
            return false;
        } else {
            return true;
        }

    }


    public static Random getRandomNumbers() {
        return new Random();
    }


    public static Scanner getInputValue() {
        return new Scanner(System.in);
    }
}
