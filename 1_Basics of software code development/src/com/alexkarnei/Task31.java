package com.alexkarnei;

import java.util.Scanner;

public class Task31 {
    public static void main() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive integer");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a > 0) {
                int i = 1;
                while (i <= a) {
                    sum = sum + i;
                    i++;
                }
                System.out.println("Sum of numbers from 1 to " + a + " = " + sum);
            } else System.out.println("The entered number does not apply to positive");
        } else System.out.println("Insert wrong data");
    }
}
