package com.java8_programs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordString {
    public static void main(String[] args) {
        String str = "Reverse each word of a string using Java 8 streams";
        String reverseString = Stream.of(str.split(" ")).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(reverseString);
    }
}
