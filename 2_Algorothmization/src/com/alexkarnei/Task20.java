package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the array");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            int[] myArray = new int[n];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(myArray));
            for (int j = 0; j < myArray.length; j++) {
                if (j % 2 != 0) {
                    myArray[j] = 0;
                }
            }
            System.out.println("New array " + Arrays.toString(myArray));
        }
    }
}
