package com.array;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 3;
        System.out.println("The " + k + "th largest element is: " + findKthLargest(nums, k));
        System.out.println("The " + k + "th largest element is: " + findKthLargestUsingLoop(nums, k));
    }

    private static int findKthLargestUsingLoop(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > maxIndex) {
                    maxIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[maxIndex];
            nums[maxIndex] = temp;
        }

        return nums[k - 1];
    }

    private static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
