package com.alexkarnei;

import java.util.Scanner;

public class Task50 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert first number ");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data!");
        } else {
            int firstNumber = sc.nextInt();
            System.out.println("First number = " + firstNumber);
            System.out.println("Insert second number");
            if (!sc.hasNextInt()) {
                System.out.println("Insert wrong data!");
            } else {
                int secondNumber = sc.nextInt();
                System.out.println("Second number = " + secondNumber);
                System.out.println("Insert third number");
                if (!sc.hasNextInt()) {
                    System.out.println("Insert wrong data!");
                } else {
                    int thirdNumber = sc.nextInt();
                    System.out.println("Third number = " + thirdNumber);
                    compireNumber(firstNumber, secondNumber, thirdNumber);
                }
            }
        }
    }

    private static void compireNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int nodFirstNumberSecondNumber = Task45.nod(firstNumber, secondNumber, 0);
        System.out.printf(" NOD (%s,%s) = %s \n", firstNumber, secondNumber, nodFirstNumberSecondNumber);
        if (nodFirstNumberSecondNumber != 1) {
            System.out.println("Numbers are not coprime!");
        } else {
            int nodFirstNumberThirdNumber = Task45.nod(firstNumber, thirdNumber, 0);
            System.out.printf(" NOD (%s,%s) = %s \n", firstNumber, thirdNumber, nodFirstNumberSecondNumber);
            if (nodFirstNumberThirdNumber != 1) {
                System.out.println("Numbers are not coprime!");
            } else {
                int nodSecondNumberThirdNumber = Task45.nod(secondNumber, thirdNumber, 0);
                System.out.printf(" NOD (%s,%s) = %s \n", secondNumber, thirdNumber, nodFirstNumberSecondNumber);
                if (nodSecondNumberThirdNumber != 1) {
                    System.out.println("Numbers are not coprime!");
                } else {
                    System.out.printf("Numbers %s, %s, %s are coprime!", firstNumber, secondNumber, thirdNumber);
                }
            }
        }
    }
}
