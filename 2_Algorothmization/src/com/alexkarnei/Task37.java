package com.alexkarnei;

import java.util.Random;
import java.util.Scanner;

public class Task37 {
    public static void main() {
        final int max = 500;
        int[] myArray = new int[max];
        int[] mySecondArray = new int[max];
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the first array ");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            System.out.print("First array: ");
            for (int i = 0; i < n; i++) {
                myArray[i] = random.nextInt(100);
                if (i < n) {
                    System.out.print(myArray[i] + " ");
                }
            }
            System.out.println();
            System.out.println("Enter the dimension of the second array ");
            if (!sc.hasNextInt()) {
                System.out.println("Insert wrong data");
            } else {
                int m = sc.nextInt();
                System.out.print("Second array: ");
                for (int i = 0; i < m; i++) {
                    mySecondArray[i] = random.nextInt(100);
                    if (i < m) {
                        System.out.print(mySecondArray[i] + " ");
                    }
                }
                System.out.println();
                System.out.print("Enter number k =  ");
                if (!sc.hasNextInt()) {
                    System.out.println("Insert wrong data");
                } else {
                    int k = sc.nextInt();
                    if (k > myArray.length - 1) {
                        System.out.println("Insert wrong data.");
                    } else {
                    }
                }
            }
        }
    }
}
