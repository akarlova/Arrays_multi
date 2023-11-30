package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int luckyNum;

    public static void main(String[] args) {
        int[][] happyNumbers = {
                {15, 25, 34, 41},
                {37, 78, 24, 13},
                {20, 30, 44, 55},
                {18, 61, 72, 80} };

        Scanner sc = new Scanner(System.in);

        //Предложим юзеру ввести число от 1 до 4, т.к. это привычнее,
        //чем от 0 до 3.
        // В программе учтем верный порядок в массиве.

        System.out.println("Please, enter row number from 1 to 4 ");
        int row = sc.nextInt();
        System.out.println("Please, enter column number from 1 to 4 ");
        int column = sc.nextInt();

        if (row==0||row > happyNumbers.length ||
                column > happyNumbers.length||column==0) {
            System.out.println("Game is over");
        }
        luckyNum = happyNumbers[row - 1][column - 1];

        for (int[] rows : happyNumbers) {
            for (int value : rows) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("\n*** And Lucky Number today is " + luckyNum+" ***");

        sc.close();
    }
}
