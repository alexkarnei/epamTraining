package com.alexkarnei;

import java.util.Random;
import java.util.Scanner;

public class Task33 {
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
            Task32.printMatrix(myArray);
            for (int k = myArray.length - 1; k > 0; k--) {
                for (int i = 0; i < k; i++) {
                    for (int j = 0; j < myArray[i].length; j++) {
                        if (myArray[i][j] > myArray[i + 1][j]) {
                            int temp = myArray[i][j];
                            myArray[i][j] = myArray[i + 1][j];
                            myArray[i + 1][j] = temp;
                        }
                    }
                }
            }
            System.out.println("Sort Ascending");
            Task32.printMatrix(myArray);
            for (int k = myArray.length - 1; k > 0; k--) {
                for (int i = 0; i < k; i++) {
                    for (int j = 0; j < myArray[i].length; j++) {
                        if (myArray[i][j] < myArray[i + 1][j]) {
                            int temp = myArray[i][j];
                            myArray[i][j] = myArray[i + 1][j];
                            myArray[i + 1][j] = temp;
                        }
                    }
                }
            }
            System.out.println("Sort descending");
            Task32.printMatrix(myArray);
        }
    }
}
