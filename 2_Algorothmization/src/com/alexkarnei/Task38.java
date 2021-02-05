package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task38 {

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
            for (int i = 0; i < n; i++) {
                myArray[i] = random.nextInt(100);
            }
            Arrays.sort(myArray);
            System.out.print(Arrays.toString(myArray));
            System.out.println();

            System.out.println("Enter the dimension of the second array ");
            if (!sc.hasNextInt()) {
                System.out.println("Insert wrong data");
            } else {
                int m = sc.nextInt();
                int[] mySecondArray = new int[m];
                System.out.print("Second array: ");
                for (int i = 0; i < m; i++) {
                    mySecondArray[i] = random.nextInt(100);
                }
                Arrays.sort(mySecondArray);
                System.out.println(Arrays.toString(mySecondArray));
                System.out.println();

                int[] result = new int[myArray.length + mySecondArray.length];
                System.arraycopy(myArray, 0, result, 0, myArray.length);
                System.arraycopy(mySecondArray, 0, result, myArray.length, mySecondArray.length);
                Arrays.sort(result);
                System.out.printf("Result array : %s", Arrays.toString(result));
            }
        }
    }
}