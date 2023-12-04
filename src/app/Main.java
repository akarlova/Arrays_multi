package app;

import java.util.Scanner;

public class Main {

    private static final int WIN_NUM = 61;
    static int count;

    public static void main(String[] args) {
        int[][] happyNumbers = {
                {15, 25, 34, 41},
                {37, 78, 24, 13},
                {20, 30, 44, 55},
                {18, 61, 72, 80}
        };
        boolean isWin = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your number ");
        int choice = sc.nextInt();

        for (int[] rows : happyNumbers) {
            for (int value : rows) {
                if (value == WIN_NUM && value == choice) {
                    isWin = true;
                    break;
                }
            }
        }
        if (isWin) {
            System.out.printf("Yes, %d is lucky!", choice);
        } else {
            System.out.println("Sorry, try again!");
        }
        sc.close();
    }
}
