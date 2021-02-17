package com.alexkarnei;

import java.util.Scanner;

public class Task48 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set enter the number of points = ");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Number of points cannot less then 1 !!!");
            } else {

            }
        }
    }
}
