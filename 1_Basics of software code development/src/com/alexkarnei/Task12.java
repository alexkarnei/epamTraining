package com.alexkarnei;

import java.rmi.NoSuchObjectException;
import java.util.Scanner;

public class Task12 {

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a =");
        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            System.out.println("Insert b =");
            if (sc.hasNextDouble()) {
                double b = sc.nextDouble();
                System.out.println("Insert с =");
                if (sc.hasNextDouble()) {
                    double c = sc.nextDouble();
                    double res = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
                    System.out.println("Result = " + res);
                } else System.out.println("Wrong input data");
            } else System.out.println("Wrong input data");
        } else System.out.println("Wrong input data");
    }
}
