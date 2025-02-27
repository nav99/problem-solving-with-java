package com.java8_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxNo {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(36, 22, 56, 95, 24, 60, 21, 47);
        int min = listOfIntegers.stream().min(Comparator.comparingInt(Integer::intValue)).get();
        int max = listOfIntegers.stream().max(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println("Min no is " + min +  '\n' + "Max no is " + max);
    }
}
