package com.string;

public class CountOccurrences {
    public static void main(String[] args) {
        String str = "bobob";
        String target = "bob";
        int index =0, count=0;
        while((index = str.indexOf(target,index))!=-1){
            count++;
            index++;
        }
        System.out.println(count);
    }
}
