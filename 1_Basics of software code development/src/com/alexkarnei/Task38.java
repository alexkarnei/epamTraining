package com.alexkarnei;

import java.util.Scanner;

public class Task38 {
    public static void main() {
        int res = 0;
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println("Input second number");
            if (sc.hasNextInt()) {
                int b = sc.nextInt();
                while (a > 0) {
                    int d = a % 10;
                    a = a / 10;
                    int c = b;
                    while (c > 0) {
                        if (c % 10 == d) {
                            res = res * 10 + d;
                        }
                        c = c / 10;
                    }
                }
                if (res != 0) {
                    for (int i = 0; i < 10; i++) {
                        int prom = res;
                        while (prom > 0) {
                            if (prom % 10 == i) {
                                counter++;
                            }

                            prom = prom / 10;
                        }
                        if (counter > 0) {
                            System.out.println(i);
                        }
                        counter = 0;
                    }
                } else
                    System.out.println("There are no numbers included in the record, both the first and second numbers");
            } else System.out.println("Insert wrong data");
        } else System.out.println("Insert wrong data");
    }
}