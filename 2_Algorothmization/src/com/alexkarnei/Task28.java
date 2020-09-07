package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task28 {
    public static void main() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the matrix");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            int[][] myArray = new int[n][n];
            int[] temp = new int[n];
            int[] tempo = new int[n];
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    myArray[i][j] = random.nextInt(10);
                    System.out.print(myArray[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("Insert number first column m");
            if (!sc.hasNextInt()) {
                System.out.println("Insert wrong data");
            } else {
                int m = sc.nextInt();
                System.out.println("Insert number second column k ");
                if (!sc.hasNextInt()) {
                    System.out.println("Insert wrong data");
                } else {
                    int k = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if ((j + 1) == m) {
                                temp[i] = myArray[i][m - 1];
                            }
                            if ((j + 1) == k) {
                                tempo[i] = myArray[i][k - 1];
                            }
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (j == (m - 1)) {
                                myArray[i][m - 1] = tempo[i];
                            }
                            if (j == (k - 1)) {
                                myArray[i][k - 1] = temp[i];
                            }
                            System.out.print(myArray[i][j] + "\t");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
