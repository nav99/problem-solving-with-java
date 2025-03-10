package com.array;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeroSumSubArray {
    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        System.out.println("Subarrays with sum 0 are:");
        printZeroSumSubarraysRange(arr);
    }

    private static void printZeroSumSubarraysRange(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(map.containsKey(sum)){
                List<Integer> indexes = map.get(sum);
                for(Integer index : indexes){
                    System.out.println("Subarray found from index " + (index + 1) + " to " + i);
                }
            }
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }
}
