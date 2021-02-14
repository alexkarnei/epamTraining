package com.alexkarnei;

import java.util.Scanner;

public class Task47 {
    public static void main() {

        int a = getSideLength();

        if (a <= 0) {
            main();
        } else
            System.out.println("Square hexagon =" + squareHexagon(a));
    }

    private static Double squareHexagon(int a) {
        double squareHexagon;
        double radius;
        radius = a * (Math.sqrt(3) / 2);
        return squareHexagon = 3 * a * radius;
    }

    private static int getSideLength() {
        Scanner sc = new Scanner(System.in);
        int sideLength = 0;

        System.out.print("Insert side length of a hexagon = ");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data!");
        } else {
            sideLength = sc.nextInt();
        }
        return sideLength;
    }

}
