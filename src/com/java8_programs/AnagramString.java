package com.java8_programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "RaqeCar";
        String s2 = "CarRace";
        s1 = Arrays.stream(s1.toLowerCase().split("")).sorted().collect(Collectors.joining());
        s2 = Arrays.stream(s2.toLowerCase().split("")).sorted().collect(Collectors.joining());
        if(s1.equals(s2)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
