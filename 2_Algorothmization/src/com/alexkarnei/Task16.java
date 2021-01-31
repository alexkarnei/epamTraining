package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task16 {
    public static void main() {
        int sum = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the array ");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            int[] myArray = new int[n];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = random.nextInt(200);
            }
            System.out.println(Arrays.toString(myArray));
            sum = getSum(sum, myArray);
            System.out.println(sum);
        }
    }

    private static int getSum(int sum, int[] myArray) {
        for (int j = 2; j < myArray.length + 1; j++) {
            int counter = 0;
            for (int k = 1; k <= j; k++) {
                if (j % k == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                sum = sum + myArray[j - 1];
            }
        }
        return sum;
    }
}

