package com.alexkarnei;

import java.util.Scanner;

public class Task24 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hole dimension A");
        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            System.out.println("Enter hole dimension B");
            if (sc.hasNextDouble()) {
                double b = sc.nextDouble();
                System.out.println("Enter the x size of the brick");
                if (sc.hasNextDouble()) {
                    double x = sc.nextDouble();
                    System.out.println("Enter the y size of the brick");
                    if (sc.hasNextDouble()) {
                        double y = sc.nextDouble();
                        if ((x < a && y < b) || (y < a && x < b)) {
                            System.out.println("The brick will go through the hole");
                        } else if (x < a || x < b || y < a || y < b) {
                            System.out.println("Enter the z size of the brick");
                            if (sc.hasNextDouble()) {
                                double z = sc.nextDouble();
                                if ((x < a && z < b) || (x < b && z < a) || (y < a && z < b) || (y < b && z < a)) {
                                    System.out.println("The brick will go through the hole");
                                } else System.out.println("Brick won't fit through the hole");
                            } else System.out.println("Insert wrong data");
                        }
                    } else System.out.println("Insert wrong data");
                } else System.out.println("Insert wrong data");
            } else System.out.println("Insert wrong data");
        } else System.out.println("Insert wrong data");
    }
}