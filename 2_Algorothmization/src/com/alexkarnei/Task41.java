package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task41 {
    public static void main() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimension of the array ");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            int[] myArray = new int[n];
            System.out.print("Start array: ");
            for (int i = 0; i < n; i++) {
                myArray[i] = random.nextInt(100);
            }
            System.out.printf("Array : %s", Arrays.toString(myArray) + "\n");
            for (int start = 0; start < myArray.length; start++) {
                int value = myArray[start];
                int i = start - 1;
                i = getAnInt(myArray, value, i);
                myArray[i + 1] = value;
            }
            System.out.printf("Result array : %s", Arrays.toString(myArray));

        }
    }

    private static int getAnInt(int[] myArray, int value, int i) {
        for (; i >= 0; i--) {
            if (value < myArray[i]) {
                myArray[i + 1] = myArray[i];
            } else {
                break;
            }
        }
        return i;
    }
}
