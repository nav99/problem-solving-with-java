package com.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15,10,6};
        int target  = 17;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value = target - nums[i];
            if(map.containsKey(value)){
                System.out.println(map.get(value) + " " + value);
            }
            map.put(nums[i],value);
        }
    }
}
