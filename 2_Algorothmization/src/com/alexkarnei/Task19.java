package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task19 {
    public static void main() {
        int max;
        int min;
        int c=0;
        int counterMax = 0;
        int counter = 0;
        int counterB = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the array");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            int[] myArray = new int[n];
            int[] myArrayB = new int[n];
            int[] myArrayC = new int[n];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = random.nextInt(10) ;
            }
            System.out.println(Arrays.toString(myArray));

            for (int j = 0; j < myArray.length; j++) {
                for (int k = j; k < myArray.length; k++) {
                    if (myArray[j] == myArray[k]) counter++;
                }
                myArrayB[j] = counter;
                counter = 0;
            }

            for (int i = 0; i < myArrayB.length; i++) {
                if (myArrayB[i] == 1) {
                    counterB++;
                }
            }

            if (counterB == myArrayB.length) {
                System.out.println("There are no repeating numbers");
            } else {
                max = myArrayB[0];
                for (int i = 0; i < myArrayB.length; i++) {
                    if (max < myArrayB[i]) {
                        max = myArrayB[i];
                        c = i;
                    }
                }
                for (int value : myArrayB) {
                    if (max == value) {
                        counterMax++;
                    }
                }
                if (counterMax == 1) {
                    System.out.println("Number " + myArray[c] +"meets " + max + " times");
                } else {
                    for (int i = 0; i < myArrayB.length; i++) {
                        if (myArrayB[i] == max) {
                            myArrayC[i] = myArrayB[i];
                        }
                    }

                    min = myArrayC[0];
                    c = 0;
                    for (int i = 0; i < myArrayC.length; i++) {

                        if (min > myArrayC[i] && myArrayC[i] != 0) {
                            min = myArrayC[i];
                            c = i;
                        }
                    }
                    System.out.println("Number " + min + " meets " + max + " times");
                }
            }
        }
    }
}
