package com.alexkarnei;

import java.util.Random;
import java.util.Scanner;

public class Task24 {
    public static void main() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension n of the matrix. n - even  ");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            if (n % 2 != 0) {
                System.out.println("Insert wrong data");
            } else {
                int[][] myArray = new int[n][n];
                for (int i = 0; i < n; i++) {
                    if (i % 2 != 0) {
                        for (int j = 0; j < n; j++) {
                            myArray[i][j] = n-j;
                            System.out.print(myArray[i][j] + "\t");
                        }
                    } else {
                        for (int j = 0; j < n; j++) {
                            myArray[i][j] = j + 1;
                            System.out.print(myArray[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}

