package com.java8_programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TwoMaxMinNo {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.print("Two min no -> ");
        listOfIntegers.stream().sorted().limit(2).forEach(no -> System.out.print(no + " "));
        System.out.print("\nTwo max no -> ");
        listOfIntegers.stream().sorted(Collections.reverseOrder()).limit(2).forEach(no -> System.out.print(no + " "));
    }
}
