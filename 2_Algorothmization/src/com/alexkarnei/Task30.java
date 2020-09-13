package com.alexkarnei;

import java.util.Random;
import java.util.Scanner;

public class Task30 {
    public static void main() {
        int counter = 0;
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
                    myArray[i][j] = random.nextInt(20) - 10;
                    if (i == j && myArray[i][j] > 0) {
                        temp[i] = myArray[i][j];
                    }
                    System.out.print(myArray[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.print("Positive elements of the main diagonal of the matrix :");
            for (int elem : temp) {
                if (elem != 0) {
                    counter++;
                    System.out.print(elem + "\t,");
                }
            }
            if (counter == 0) {
                System.out.println("No positive elements of the main diagonal of the matrix");
            }
        }
    }
}
