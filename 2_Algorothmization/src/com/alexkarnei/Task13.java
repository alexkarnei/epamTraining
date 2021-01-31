package com.alexkarnei;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {
    public static void main() {
        int sumPositive = 0;
        int sumNegative = 0;
        int sumZero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the array");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            int[] myArray = new int[n];
            for (int i = 0; i < myArray.length; i++) {
                System.out.printf("Insert %d = ", i);
                if (!sc.hasNextInt()) {
                    System.out.println("Insert wrong data");
                }
                myArray[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(myArray));
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[j] == 0) {
                    sumZero++;
                } else if (myArray[j] < 0) {
                    sumNegative++;
                } else {
                    sumPositive++;
                }
            }
            System.out.println("Quantity of zero members = " + sumZero + "\n" +
                    "Quantity of positive members = " + sumPositive + "\n" +
                    "Quantity of negative members = " + sumNegative);
        }
    }
}
