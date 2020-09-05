package com.alexkarnei;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main() {
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
            System.out.println("Insert number Z ");
            if (!sc.hasNextInt()) {
                System.out.println("Insert wrong data");
            }
            int z = sc.nextInt();
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[j] > z) {
                    myArray[j] = z;
                }
            }
            System.out.println(Arrays.toString(myArray));
        }
    }
}
