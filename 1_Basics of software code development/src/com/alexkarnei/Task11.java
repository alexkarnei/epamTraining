package com.alexkarnei;

import java.util.Scanner;

public class Task11 {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a =");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println("Insert b =");
            if (sc.hasNextInt()) {
                int b = sc.nextInt();
                System.out.println("Insert c =");
                if (sc.hasNextInt()) {
                    int c = sc.nextInt();
                    int z = ((a - 3) * b / 2) + c;
                    System.out.println("z = " + z);
                } else System.out.println("Wrong input data");
            } else System.out.println("Wrong input data");
        } else System.out.println("Wrong input data");


    }
}
