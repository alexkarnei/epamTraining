package com.alexkarnei;

import java.util.Scanner;

public class Task27 {
    public static void main() {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension n of the matrix. n - even  ");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            if (n % 2 != 0) {
                System.out.println("Insert wrong data");
            } else {
                double[][] myArray = new double[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        myArray[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                        if (myArray[i][j] > 0) {
                            counter++;
                        }
                        System.out.print(myArray[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("Number of positive members = " + counter);
            }
        }
    }
}
