package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main() {
        Random random = new Random();
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert array dimension");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] myArrayA = new int[n];
            for (int i = 0; i < myArrayA.length; i++) {
                myArrayA[i] = random.nextInt(101);
            }
            System.out.println(Arrays.toString(myArrayA));
            System.out.println("Insert K ");
            if (sc.hasNextInt()) {
                int k = sc.nextInt();
                for (int j = 0; j < myArrayA.length; j++) {
                    if (myArrayA[j] % k == 0) {
                        sum = sum + myArrayA[j];
                    }
                }
                System.out.println("The sum of array elements is a multiple of K = " + sum);
            } else System.out.println("Insert wrong data");
        } else System.out.println("Insert wrong data");
    }
}
