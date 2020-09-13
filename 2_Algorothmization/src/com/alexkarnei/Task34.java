package com.alexkarnei;

import java.util.Scanner;

public class Task34 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int m = sc.nextInt();
            System.out.println("Enter the number of columns");
            if (!sc.hasNextInt()) {
                System.out.println("Insert wrong data");
            } else {
                int n = sc.nextInt();
                int[][] myArray = new int[m][n];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        if (j >= i) {
                            myArray[i][j] = 1;
                        } else {
                            myArray[i][j] = 0;
                        }
                        System.out.print(myArray[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
        }
    }
}