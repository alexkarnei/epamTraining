package com.alexkarnei;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task18 {
    public static void main() {
        int counter = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the array");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            int[] myArray = new int[n];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(myArray));
            int [] sortArray = Arrays.copyOf(myArray,myArray.length);
            Arrays.sort(sortArray);
            for (int j = 0; j < myArray.length; j++) {
                int min = myArray[0];
                if (myArray[j] == min) {
                    counter++;
                }
            }
            int[] newArray = new int[myArray.length - counter];
            for (int k = 0; k < myArray.length-counter; k++) {
                if (myArray[k] == sortArray[0]) {
                    newArray[k] = myArray[k+1];
                    k=k++;
                }else{
                    newArray[k] = myArray[k];
                }
            }
            System.out.println(Arrays.toString(newArray));
        }
    }
}
