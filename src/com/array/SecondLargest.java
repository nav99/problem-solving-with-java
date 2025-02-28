package com.array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12,17,14,13,19,18,10,22,1};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            } else if( arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println(firstMax + " " + secondMax);
    }
}
