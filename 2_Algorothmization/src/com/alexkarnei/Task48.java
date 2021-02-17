package com.alexkarnei;

import java.util.Arrays;
import java.util.Scanner;

public class Task48 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set enter the number of points = ");
        if (!sc.hasNextInt()) {
            System.out.println("Insert wrong data");
        } else {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Number of points cannot less then 1 !!!");
            } else {
                int[][] array = new int[n][2];
                for (int i = 0; i < array.length; i++) {
                    System.out.printf("Enter the coordinates of the point %s \n", i + 1);
                    for (int j = 0; j < array[i].length; j++) {
                        if (!sc.hasNextInt()) {
                            System.out.println("Insert wrong data");
                        } else {
                            array[i][j] = sc.nextInt();
                        }
                    }
                }
                Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
                int[] myArray = pointsArray(array);
                System.out.printf("Largest distance between points  = %s", Arrays.toString(myArray));
            }
        }
    }

    private static int[] pointsArray(int[][] array) {
        double maxDistance = 0;
        int[] newArray = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                double temp = Math.sqrt(Math.pow((array[i][0] - array[j][0]), 2) + Math.pow((array[i][1] - array[j][1]), 2));
                System.out.println(temp);
                if (temp > maxDistance) {
                    maxDistance = temp;
                    newArray[0] = i + 1;
                    newArray[1] = j + 1;
                }
            }
        }
        return newArray;
    }
}
