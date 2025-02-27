package com.java8_programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        int[] array = new int[]{15, 22, 66, 42, 11, 82};
        int reverseArr[] = IntStream.range(0, array.length).map(i -> array[array.length - 1 - i]).toArray();
        System.out.println(Arrays.toString(reverseArr));
    }
}
