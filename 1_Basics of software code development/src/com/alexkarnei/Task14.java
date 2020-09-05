package com.alexkarnei;

import java.util.Scanner;

public class Task14 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number R kind nnn.ddd");
        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            double x = (a * 1000) % 1000;
            int c = (int) a;
            if (c > 99 & c < 1000) {
                double y = (int) a / 1000.0;
                if (x % 10 != 0) {
                    double result = x + y;
                    System.out.println("Result = " + result);
                } else System.out.println("Insert number not kind nnn.ddd");
            } else System.out.println("Insert number not kind nnn.ddd");
        } else System.out.println("Wrong input data!");
    }
}
