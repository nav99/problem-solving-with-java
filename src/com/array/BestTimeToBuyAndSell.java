package com.array;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); // Output: 5
    }

    private static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxPrice = Math.max(maxPrice, price - minPrice);
        }
        return maxPrice;
    }
}
