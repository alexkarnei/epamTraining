package com.alexkarnei;

import java.util.Scanner;

public class Task32 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a ");
        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            System.out.println("Insert b");
            if (sc.hasNextDouble()) {
                double b = sc.nextDouble();
                System.out.println("Insert step h");
                if (sc.hasNextDouble()) {
                    double h = sc.nextDouble();
                    for (double x = a; x <= b - h; x += h) {
                        if (x > 2) {
                            double y = x;
                            System.out.println(" y = " + y);
                        } else {
                            double y = -x;
                            System.out.println(" y = " + y);
                        }
                    }
                } else System.out.println("Insert wrong data");
            } else System.out.println("Insert wrong data");
        } else System.out.println("Insert wrong data");
    }
}
