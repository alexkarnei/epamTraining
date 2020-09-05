package com.alexkarnei;

import java.util.Scanner;

public class Task16 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert x coordinate  ");
        if (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            System.out.println("Insert y coordinate");
            if (sc.hasNextDouble()) {
                double y = sc.nextDouble();
                if ((x >= -2 && x <= 2 && y >= 0 && y <= 4)||(x>=-4 && x<=4 && y>=-3 && y<=0)) {
                    System.out.println("True");
                } else System.out.println("False");
            } else System.out.println("Wrong insert data.");
        } else System.out.println("Wrong insert data.");
    }
}
