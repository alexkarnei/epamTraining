package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task29 {
    public static void main() {
        int columnNumber = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert dimension matrix");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            int[][] myArray = new int[n][n];
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    myArray[i][j] = random.nextInt(50);
                    System.out.print(myArray[i][j] + "\t");
                }
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (j == k) {
                            temp[k] = temp[k] + myArray[i][k];
                        }
                    }
                }
            }
            int max = temp[0];
            for (int i = 1; i < n; i++) {
                if (temp[i] > max) {
                    max = temp[i];
                    columnNumber = i + 1;
                }
            }
            System.out.println("Maximum sum at column = " + max + " Column number = " + columnNumber);
        }
    }
}
