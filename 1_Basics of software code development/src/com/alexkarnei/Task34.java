package com.alexkarnei;

public class Task34 {
    public static void main() {
        int comp = 1;
        for (int i = 1; i <= 200; i++) {
            comp = (int) (comp * Math.pow(i, 2));
        }
        System.out.println("The product of the squares of the first two hundred numbers = " + comp);
    }
}
