package com.alexkarnei;

import java.util.Scanner;

public class Task15 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number T");
        if (sc.hasNextInt()) {
            int time = sc.nextInt();
            int sec = time % 60;
            int res = time / 60;
            if (res > 0) {
                int min = res % 60;
                int res1 = res / 60;
                if (res1 > 0) {
                    int hour = res1%60;
                    System.out.println(hour + "ч " + min + "м " + sec + "c ");
                } else System.out.println("00ч" + min + "м" + sec + "c");
            } else System.out.println("00ч 00м" + sec + "c");
        } else System.out.println("Wrong input data!");
    }
}
