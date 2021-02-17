package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task39 {
    public static void main() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimension of the array ");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            int[] myArray = new int[n];
            System.out.print("First array: ");
            for (int i = 0; i < n; i++) {
                myArray[i] = random.nextInt(100);
            }
            System.out.printf("Array : %s", Arrays.toString(myArray) + "\n");
            for (int i = 0; i < myArray.length - 1; i++) {
                int maxElem;
                int maxElementIndex = i;
                for (int j = i + 1; j < myArray.length; j++) {
                    if (myArray[j] > myArray[maxElementIndex]) {
                        maxElementIndex = j;
                    }
                }
                maxElem = myArray[maxElementIndex];
                myArray[maxElementIndex] = myArray[i];
                myArray[i] = maxElem;

            }
            System.out.printf("Result array : %s", Arrays.toString(myArray));
        }
    }
}
