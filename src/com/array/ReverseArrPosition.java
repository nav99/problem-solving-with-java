package com.array;

public class ReverseArrPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 2, end = 6;
        reverseArray(arr, start, end);
        for (int no : arr)
            System.out.print(no + " ");
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
