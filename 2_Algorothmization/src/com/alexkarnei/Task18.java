package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task18 {
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
                myArray[i] = random.nextInt(50)-20;
            }
            System.out.println(Arrays.toString(myArray));

            int min = Integer.MAX_VALUE;
            for (int temp : myArray) min = Math.min(min, temp);
            int counter = 0;
            for (int temp : myArray)
                if (temp == min) counter++;

            int[] newArray = getNewArray(myArray, min, counter);
            System.out.println("New Array " + Arrays.toString(newArray));
        }
    }

    private static int[] getNewArray(int[] myArray, int min, int counter) {
        int[] newArray = new int[myArray.length - counter];
        int indexNewArray = 0;
        for (int temp : myArray)
            if (temp != min) {
                newArray[indexNewArray++] = temp;
            }
        return newArray;
    }
}
