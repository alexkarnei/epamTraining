package com.alexkarnei;

import java.util.Scanner;

public class Task21 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert first triangle angle ");
        if (sc.hasNextDouble()) {
            double firstAngle = sc.nextDouble();
            if (firstAngle < 180 && firstAngle > 0) {
                System.out.println("Insert second triangle angle ");
                if (sc.hasNextDouble()) {
                    double secondTriangle = sc.nextDouble();
                    if (secondTriangle > 0 && secondTriangle < 180 && (secondTriangle + firstAngle) < 180) {
                        System.out.println("Triangle is exists");
                        double thirdAngle = 180 - (firstAngle + secondTriangle);
                        if (firstAngle == 90 || secondTriangle == 90 || thirdAngle == 0) {
                            System.out.println("Rectangular triangle");
                        } else System.out.println("Not rectangular triangle");
                    } else System.out.println("Triangle das not exist");
                } else System.out.println("Insert wrong data");
            } else System.out.println("Triangle das not exist ");
        } else System.out.println("Insert wrong data");
    }
}
