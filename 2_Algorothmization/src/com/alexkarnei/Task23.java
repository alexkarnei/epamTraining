package com.alexkarnei;

import java.util.Random;
import java.util.Scanner;

public class Task23 {
    public static void main() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            System.out.println("Enter the number of columns");
            if (!sc.hasNextInt()) {
                System.out.println("Insert wrong data");
            } else {
                int m = sc.nextInt();
                int[][] myArray = new int[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        myArray[i][j] = random.nextInt(10);
                        System.out.print(myArray[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println(" Insert k ");
                if (!sc.hasNextInt()) {
                    System.out.println("Insert wrong data");
                } else {
                    int k = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (i == (k - 1))
                                System.out.print(myArray[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
                System.out.println("Insert p ");
                if (!sc.hasNextInt()) {
                    System.out.println("Insert wrong data");
                } else {
                    int p = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (j == (p - 1))
                                System.out.print(myArray[i][j] + "\t");
                        }
                    }
                }
            }
        }
    }
}
