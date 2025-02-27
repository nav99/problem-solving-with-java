package com.array;

public class ElementGreaterThenItself {
    public static void main(String[] args) {
        int[] arr = {-3, -2, 6, 8, 4, 8, 5};
        int max = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                count++;
            }
        }

        System.out.print("No of element greater then itself is ");
        System.out.println(arr.length - count);
    }
}
