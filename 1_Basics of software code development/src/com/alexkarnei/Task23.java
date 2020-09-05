package com.alexkarnei;

import java.util.Scanner;

public class Task23 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of point A");
        System.out.println("Insert x1");
        if (sc.hasNextDouble()) {
            double x1 = sc.nextDouble();
            System.out.println("Insert y1");
            if (sc.hasNextDouble()) {
                double y1 = sc.nextDouble();
                System.out.println("Enter the coordinates of point B");
                System.out.println("Insert x2");
                if (sc.hasNextDouble()) {
                    double x2 = sc.nextDouble();
                    System.out.println("Insert y2");
                    if (sc.hasNextDouble()) {
                        double y2 = sc.nextDouble();
                        System.out.println("Enter the coordinates of point C");
                        System.out.println("Insert x3");
                        if (sc.hasNextDouble()) {
                            double x3 = sc.nextDouble();
                            System.out.println("Insert y3");
                            if (sc.hasNextDouble()) {
                                double y3 = sc.nextDouble();
                                if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
                                    System.out.println("The points lie on one straight line");
                                } else System.out.println("Points do not lie on one straight line");
                            } else System.out.println("Insert wrong data");
                        } else System.out.println("Insert wrong data");
                    } else System.out.println("Insert wrong data");
                } else System.out.println("Insert wrong data");
            } else System.out.println("Insert wrong data");
        } else System.out.println("Insert wrong data");
    }
}
