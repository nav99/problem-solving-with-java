package com.array;
/*
You are given an array of integers A of size N.
Return the difference between the maximum among all even numbers of A and
the minimum among all odd numbers in A.
*/

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumPicks {
    public static void main(String[] args) {
        int[] arr = {1,2,44,55,9};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                if (arr[i] > max ) max = arr[i] ;
            } else {
                if(arr[i] < min) min = arr[i];
            }
        }
        System.out.println(max - min);
        ArrayList<Integer> A = (ArrayList<Integer>) IntStream.of(arr).boxed().collect(Collectors.toList());
        System.out.println(solve(A));

    }
    public static int solve(ArrayList<Integer> A) {
        int evenMax = Integer.MIN_VALUE;
        int oddMin = Integer.MAX_VALUE;
        for(int no : A){
            if(no%2==0){
                if(no>evenMax)
                    evenMax = no;
            } else {
                if(no<oddMin){
                    oddMin = no;
                }
            }

        }
        return evenMax - oddMin;
    }
}
