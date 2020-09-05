package com.alexkarnei;

import java.util.Scanner;

public class Task25 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert x");
        if (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            if (x <= 3) {
                double fx = Math.pow(x,2) - 3 * x + 9;
                System.out.println("f(x) = " + fx);
            } else {
                double fx = 1 / (Math.pow(x, 3) + 6);
                System.out.println("f(x) = " + fx);
            }
        } else System.out.println("Insert wrong data");
    }
}
