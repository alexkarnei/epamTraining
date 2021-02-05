package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task40 {
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
            boolean sorted= false;
            int temp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < myArray.length - 1; i++) {
                    if (myArray[i] > myArray[i + 1]) {
                        temp = myArray[i];
                        myArray[i] = myArray[i + 1];
                        myArray[i + 1] = temp;
                        sorted=false;
                    }
                }
            }
            System.out.printf("Result array : %s", Arrays.toString(myArray));
        }
    }
}
