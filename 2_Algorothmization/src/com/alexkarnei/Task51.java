package com.alexkarnei;

/**
 * Написать метод вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class Task51 {
    public static void main() {
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                sum = sum + factorial(i);
            }
        }
        System.out.printf("Sum of factorial of number 1 to 9 = %s", sum);
    }

    private static int factorial(int n) {
        int result = 1;
        if (n == 1) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }
}
