package com.alexkarnei;

public class Task33 {
    public static void main() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = (int) (sum + Math.pow(i, 2));
        }
        System.out.println("Sum of the squares of the first hundred numbers = " + sum);
    }
}
