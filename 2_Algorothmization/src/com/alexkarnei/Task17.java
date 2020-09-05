package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task17 {
    public static void main() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the array. The dimension must be even ");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            if (n % 2 != 0) {
                System.out.println("Insert wrong data");
            } else {
                int[] myArray = new int[n];
                for (int i = 0; i < myArray.length; i++) {
                    myArray[i] = random.nextInt(200);
                }
                System.out.println(Arrays.toString(myArray));
                int[] newMyArray = new int[myArray.length / 2];
                for (int t = 0; t < myArray.length / 2; t++) {
                    newMyArray[t] = myArray[t] + myArray[(myArray.length - 1) - t];
                }
                System.out.println(Arrays.toString(newMyArray));
                for (int j = newMyArray.length - 1; j > 0; j--) {
                    for (int k = 0; k < j; k++) {
                        if (newMyArray[k] > newMyArray[k + 1]) {
                            int tmp = newMyArray[k];
                            newMyArray[k] = newMyArray[k + 1];
                            newMyArray[k + 1] = tmp;
                        }
                    }
                }
                System.out.print("Maximun = " + newMyArray[newMyArray.length - 1]);
            }
        }
    }
}

