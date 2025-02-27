package com.array;

public class RotateArrKthPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        rotateArr(arr, k);

        for (int no : arr)
            System.out.print(no + " ");

    }

    private static void rotateArr(int[] arr, int k) {
        reverseArr(arr, 0, arr.length - 1);
        reverseArr(arr, 0, k - 1);
        reverseArr(arr, k, arr.length - 1);
    }

    private static void reverseArr(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
