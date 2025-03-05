package com.string;

public class LongestPalindromeBruteForce {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s)); // Output: "bab" or "aba"
    }

    private static String  longestPalindrome(String s) {
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(isPalindrome(s,i,j) && (j-i+1) > longest.length() ){
                    longest = s.substring(i,j+1);
                }
            }
        }
        return longest;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i<j){
            if(s.charAt(i) !=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
