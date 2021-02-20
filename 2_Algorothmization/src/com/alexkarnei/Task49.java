package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task49 {
    public static void main() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert array dimension =  ");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            int[] myArray = new int[n];
            System.out.print("Array: ");
            Task37.arrayInput(random, n, myArray);
            Arrays.sort(myArray);
            int requiredElem = myArray[myArray.length-2];
            System.out.println("\nRequired element =" + requiredElem);
        }
    }
}
