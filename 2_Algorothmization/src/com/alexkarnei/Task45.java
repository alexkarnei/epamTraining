package com.alexkarnei;

import java.util.Scanner;

public class Task45 {
    public static void main() {
        int r1 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert A = ");
        int A = getNumber(sc);
        if (!checkNumber(A)) {
            System.out.println("Insert wrong data");
            return;
        }

        System.out.print("Insert  B = ");
        int B = getNumber(sc);
        if (!checkNumber(B)) {
            System.out.println("Insert wrong data");
            return;
        }

        int resultNOD = nod(A, B, r1);
        System.out.println("НОД (A,B) = " + resultNOD);
        int resultNOK = nok(A, B, resultNOD);
        if (resultNOK == 0) {
            System.out.println("Ошибка деления на ноль! Для нахождения НОК необходимо A>0 и B>0!");
        } else {
            System.out.println("НОК (A,B) = " + resultNOK);
        }
    }

    public static int getNumber(Scanner sc) {
        if (!sc.hasNextInt()) {
            return -1;
        } else {
            int temp = sc.nextInt();
            if (temp < 0) {
                return -temp;
            }
            return temp;
        }
    }

    public static boolean checkNumber(int number) {
        return number != -1;
    }

    private static int nok(int A, int B, int result) {

        if (A != 0 && B != 0 && result != 0) {
            int resultNok = (A * B) / result;
            return resultNok;
        } else return 0;
    }

    public static int nod(int A, int B, int r1) {

        if (B > A) {
            int temp = A;
            A = B;
            B = temp;
        }
        if (B != 0) {
            if (A != B) {
                if (A % B == 0) {
                    return B;
                }
                while (A % B > 0) {

                    r1 = 0;
                    int r = A % B;
                    r1 = r1 + r;
                    A = B;
                    B = r;
                }
                return r1;
            } else {
                return A;
            }
        } else {
            return A;
        }
    }
}
