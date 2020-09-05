package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the array ");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            int max;
            int min;
            int[] myArray = new int[n];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = random.nextInt(200);
            }
            System.out.println(Arrays.toString(myArray));

            for (int j = myArray.length - 1; j > 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (myArray[k] > myArray[k + 1]) {
                        int tmp = myArray[k];
                        myArray[k] = myArray[k + 1];
                        myArray[k + 1] = tmp;
                    }
                }
            }
            System.out.println("Minimum element = " + myArray[0] + "\n" +
                    "Maximum element = " + myArray[myArray.length - 1]);
        }
    }
}
