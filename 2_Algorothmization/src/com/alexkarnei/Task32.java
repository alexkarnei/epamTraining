package com.alexkarnei;

import java.util.Random;
import java.util.Scanner;

public class Task32 {
    public static void main() {
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
                    myArray[i][j] = random.nextInt(10);
                }
            }
            printMatrix(myArray);
            for (int i = 0; i < n; i++) {
                for (int k = myArray[i].length - 1; k > 0; k--) {
                    for (int j = 0; j < k; j++) {
                        if (myArray[i][j] > myArray[i][j + 1]) {
                            int temp = myArray[i][j];
                            myArray[i][j] = myArray[i][j + 1];
                            myArray[i][j + 1] = temp;
                        }
                    }
                }
            }
            System.out.println("Sort Ascending");
            printMatrix(myArray);
            for (int i = 0; i < n; i++) {
                for (int k = myArray[i].length - 1; k > 0; k--) {
                    for (int j = 0; j < k; j++) {
                        if (myArray[i][j] < myArray[i][j + 1]) {
                            int temp = myArray[i][j];
                            myArray[i][j] = myArray[i][j + 1];
                            myArray[i][j + 1] = temp;
                        }
                    }
                }
            }
            System.out.println("Sort descending");
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
