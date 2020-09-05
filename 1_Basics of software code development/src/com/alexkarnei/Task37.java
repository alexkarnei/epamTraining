package com.alexkarnei;

import java.util.Scanner;

public class Task37 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert m");
        if (sc.hasNextInt()) {
            int m = sc.nextInt();
            System.out.println("Insert n");
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                int counter = 0;
                for (int i = m; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        if (i % j == 0 && j != 1 && j != i) {
                            counter++;
                            System.out.printf("Divider %d = %d \n", i, j);
                        }
                    }
                    if (counter == 0) {
                        System.out.printf("No divider %d \n", i);
                    } else counter = 0;
                }
            } else System.out.println("Insert wrong data");
        } else System.out.println("Insert wrong data");
    }
}
