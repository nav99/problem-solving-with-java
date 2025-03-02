package com.java8_programs;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println("Enter No");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println(sqRoot(no));
    }

    private static int sqRoot(int no) {
        for(int i=1;i<=no;i++){
            if(i*i==no)
                return i;
        }
        return -1;
    }
}
