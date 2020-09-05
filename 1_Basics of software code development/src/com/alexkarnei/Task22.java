package com.alexkarnei;

import java.util.Scanner;

public class Task22 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String minAB = minTwoNumber(sc);
        String minCD = minTwoNumber(sc);
        if (!minAB.equals("Insert wrong data") && !minCD.equals("Insert wrong data")) {
            int min1 = Integer.parseInt(minAB);
            int min2 = Integer.parseInt(minCD);
            if (min1 > min2) {
                System.out.println("max{min{a,b},min{c,d}} = " + minAB);
            } else System.out.println("max{min{a,b},min{c,d}} = " + minCD);
        } else System.out.println("Insert wrong data");
    }

    private static String minTwoNumber(Scanner sc) {
        int min;
        System.out.println("Insert first number");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println("Insert second number");
            if (sc.hasNextInt()) {
                int b = sc.nextInt();
                if (a != b) {
                    if (a > b) {
                        min = b;
                    } else {
                        min = a;
                    }
                } else {
                    min = a;
                }
                System.out.println("min{first,second} = " + min);
                return Integer.toString(min);
            } else return "Insert wrong data";
        } else return "Insert wrong data";
    }
}
