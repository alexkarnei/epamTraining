package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task37 {
    public static void main() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the first array ");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            int[] myArray = new int[n];
            System.out.print("First array: ");
            arrayInput(random, n, myArray);
            System.out.println();
            System.out.println("Enter the dimension of the second array ");
            if (!sc.hasNextInt()) {
                System.out.println("Insert wrong data");
            } else {
                int m = sc.nextInt();
                int[] mySecondArray = new int[m];
                System.out.print("Second array: ");
                arrayInput(random, m, mySecondArray);
                System.out.println();
                System.out.print("Enter number k =  ");
                if (!sc.hasNextInt()) {
                    System.out.println("Insert wrong data");
                } else {
                    int k = sc.nextInt();
                    if (k > myArray.length - 1) {
                        System.out.println("Insert wrong data.");
                    } else {
                        int[] resultArray = new int[myArray.length + mySecondArray.length];
                        System.arraycopy(myArray, 0, resultArray, 0, k);
                        System.arraycopy(mySecondArray, 0, resultArray, k, mySecondArray.length);
                        System.arraycopy(myArray, k, resultArray, mySecondArray.length  + k, myArray.length - k);
                        System.out.println("Result array = " + Arrays.toString(resultArray));
                    }
                }
            }
        }
    }

    public static void arrayInput(Random random, int n, int[] myArray) {
        for (int i = 0; i < n; i++) {
            myArray[i] = random.nextInt(100);
            System.out.print(myArray[i] + " ");
        }
    }
}
