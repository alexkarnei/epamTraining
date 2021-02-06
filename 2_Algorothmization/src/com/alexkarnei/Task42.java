package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task42 {
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
            int length = myArray.length / 2;
            int temp;
            while (length >= 1) {
                for (int i = 0; i < myArray.length; i++) {
                    for (int j = i - length; j >= 0; j -= length) {
                        if (myArray[j] > myArray[j + length]) {
                            temp = myArray[j + length];
                            myArray[j + length] = myArray[j];
                            myArray[j] = temp;
                        }
                    }
                }
                length = length / 2;
            }
            System.out.printf("Result array : %s", Arrays.toString(myArray));
        }
    }
}
