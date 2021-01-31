package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task22 {
    public static void main() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the matrix");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            int[][] myArray = new int[n][n];
            createArray(random, myArray);
            System.out.print("Elements standing diagonally : ");
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    if (i == j) {
                        System.out.print(myArray[i][j] + "\t");
                    }
                }
            }
        }
    }

    private static void createArray(Random random, int[][] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = random.nextInt(10);
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
