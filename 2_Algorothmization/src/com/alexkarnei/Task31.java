package com.alexkarnei;

import java.util.Random;

public class Task31 {
    public static void main() {
        int counter = 0;
        int counterL = 0;
        Random random = new Random();
        int[][] myArray = new int[10][20];
        int[] temp = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = random.nextInt(15);
                if (myArray[i][j] == 5) {
                    counter++;
                }
                System.out.print(myArray[i][j] + "\t");
            }
            if (counter >= 3) {
                temp[i] = i + 1;
            }
            counter = 0;
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            if (temp[i] != 0) {
                counterL++;
                System.out.print("String number : ");
                System.out.println(temp[i] + "\t");
            }
        }
        if (counterL == 0) {
            System.out.println("There are no lines in which 5 occurs 3 or more times");
        }
    }
}
