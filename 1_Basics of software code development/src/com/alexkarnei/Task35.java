package com.alexkarnei;

import java.util.Scanner;

public class Task35 {
    public static void main() {
        int n = 1;
        double a;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert e");
        if (sc.hasNextDouble()) {
            double e = sc.nextDouble();
            do {
                a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
                sum = sum + a;
                n++;
            }
            while (Math.abs(a) <= e);
            System.out.println(" Sum = "+sum);
        } else System.out.println("Insert wrong data");
    }
}
