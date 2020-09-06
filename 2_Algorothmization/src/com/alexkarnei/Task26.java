package com.alexkarnei;

import java.util.Scanner;

public class Task26 {
    public static void main() {
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
                    for (int j = n - 1; j >= 0; j--) {

                        System.out.print(myArray[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
        }
    }
}
