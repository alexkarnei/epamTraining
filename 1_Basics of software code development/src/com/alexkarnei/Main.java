package com.alexkarnei;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a topic task :\n1 -Линейные алгоритмы;\n2 - Ветвления;\n3 - Циклы; ");
        if (sc.hasNextInt()) {
            int q = sc.nextInt();
            if (q == 1||q==2||q==3) {
                System.out.println("Insert task number. For exit insert 0 ");
                if (sc.hasNextInt()) {
                    int i = sc.nextInt();
                    if (i != 0) {
                        int number = q * 10 + i;
                        switchCase(number);
                    } else System.out.println("Stop and exist !!!");
                } else System.out.println(" Wrong input data");
            } else System.out.println(" Wrong input data");
        }else System.out.println(" Wrong input data");
    }

    private static void switchCase(int number) {
        switch (number) {
            case 11:
                Task11.main();
                break;
            case 12:
                Task12.main();
                break;
            case 13:
                Task13.main();
                break;
            case 14:
                Task14.main();
                break;
            case 15:
                Task15.main();
                break;
            case 16:
                Task16.main();
                break;
            case 21:
                Task21.main();
                break;
            case 22:
                Task22.main();
                break;
            case 23:
                Task23.main();
                break;
            case 24:
                Task24.main();
                break;
            case 25:
                Task25.main();
                break;
            case 31:
                Task31.main();
                break;
            case 32:
                Task32.main();
                break;
            case 33:
                Task33.main();
                break;
            case 34:
                Task34.main();
                break;
            case 35:
                Task35.main();
                break;
            case 36:
                Task36.main();
                break;
            case 37:
                Task37.main();
                break;
            case 38:
                Task38.main();
                break;
            default:
                System.out.println("Wrong task number!!!");
                break;
        }
    }
}
