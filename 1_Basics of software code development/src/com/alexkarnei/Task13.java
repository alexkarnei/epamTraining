package com.alexkarnei;

import java.util.Scanner;

public class Task13 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert x ");
        if (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            System.out.println("Insert y");
            if (sc.hasNextDouble()) {
                double y = sc.nextDouble();
                double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
                System.out.println("Result = "+result);
            } else System.out.println("Wrong input data!");
        } else System.out.println("Wrong input data!");


    }
}
