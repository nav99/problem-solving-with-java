package com.practice_programs;

import java.util.Scanner;

// Count no of factor of given number
public class FactorizationNo {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int countFactor = 0;

        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                if (i != number / i) {
                    countFactor = countFactor + 2;
                } else
                    countFactor++;
            }
        }
        System.out.println("Factor of give no is " + countFactor);
    }
}
