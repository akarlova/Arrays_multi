package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int luckyNum;
    static int count;

    public static void main(String[] args) {
        int[][] happyNumbers = {
                {15, 25, 34, 41},
                {37, 78, 24, 13},
                {20, 30, 44, 55},
                {18, 61, 72, 80}};

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your number ");
        int number = sc.nextInt();

        for (int[] rows : happyNumbers) {
            for (int value : rows) {
                if (value == number) {
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.printf("Yes, %d is lucky!", number);
        } else {
            System.out.println("Sorry, try again!");
        }
        sc.close();
    }
}
