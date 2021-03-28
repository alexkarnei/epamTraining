package com.alexkarnei;

import java.util.Scanner;

/**
 * Написать методы для нахлждения наибольшего общего делителя четырех натуральных чисел.
 */

public class Task46 {
    public static void main() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert A = ");
        int A = Task45.getNumber(sc);
        if(Task45.checkNumber(A)){
            System.out.println("Insert wrong data!");
            return;
        }

        System.out.print("Insert B = ");
        int B = Task45.getNumber(sc);
        if(Task45.checkNumber(B)){
            System.out.println("Insert wrong data!");
            return;
        }

        System.out.print("Insert C = ");
        int C = Task45.getNumber(sc);
        if(Task45.checkNumber(C)){
            System.out.println("Insert wrong data!");
            return;
        }

        System.out.print("Insert D = ");
        int D = Task45.getNumber(sc);
        if(Task45.checkNumber(D)){
            System.out.println("Insert wrong data!");
            return;
        }

        int nodAB = Task45.nod(A, B, r1);
        int nodCD = Task45.nod(C, D, r2);

        int result = Task45.nod(nodAB, nodCD, r3);
        System.out.println("НОД (A,B,C,D) = " + result);
    }
}
