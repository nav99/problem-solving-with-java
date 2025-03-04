package com.practice_programs;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s="[()[]{}]";
        if(isValid(s)){
            System.out.println("Valid string");
        } else {
            System.out.println("Not valid string");
        }
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            } else if(!stack.isEmpty() && isValidParenthesis(stack.peek(),s.charAt(i))){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    private static boolean isValidParenthesis(Character open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
