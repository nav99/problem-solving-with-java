package com.java8_programs;

import java.util.Scanner;

public class FactorNo {
    public static void main(String[] args) {
        System.out.println("Enter no");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int countFactor =0;
        for(int i=1;i<=no;i++){
            if(no%i==0){
                countFactor++;
            }
        }
        System.out.println("No of factor for given no " + no + " is " + countFactor);

        // Factor of no always in pair
        countFactor = 0;
        for(int i=1;i*i<=no;i++){
            if(no%i==0){
                if(i !=no/i){
                    countFactor = countFactor +2;
                } else
                    countFactor++;
            }

        }
        System.out.println("No of factor for given no " + no + " is " + countFactor);
    }
}
