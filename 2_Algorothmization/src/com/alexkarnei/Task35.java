package com.alexkarnei;

import java.util.Random;
import java.util.Scanner;

public class Task35 {
    public static void main() {
        int maxElem;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the matrix");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            int[][] myArray = new int[n][n];
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    myArray[i][j] = random.nextInt(15);
                }
            }
            printMatrix(myArray);
            maxElem = myArray[0][0];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (myArray[i][j] > maxElem) {
                        maxElem = myArray[i][j];
                    }
                }
            }
            System.out.println("Maximum element = " + maxElem);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (myArray[i][j] % 2 != 0) {
                        myArray[i][j] = maxElem;
                    }
                }
            }
            System.out.println(" Result matrix: ");
            printMatrix(myArray);
        }
    }


    public static void printMatrix(int[][] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
