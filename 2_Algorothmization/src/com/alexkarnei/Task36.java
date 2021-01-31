package com.alexkarnei;

import java.util.Random;
import java.util.Scanner;

public class Task36 {
    public static void main() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the matrix");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            int[][] magicSqr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int number = random.nextInt((n * n) + 1);
                }
            }
            Task32.printMatrix(magicSqr);
        }
    }
}
