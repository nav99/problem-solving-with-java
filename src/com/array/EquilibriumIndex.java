package com.array;

import java.util.ArrayList;
import java.util.List;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        List<Integer> equilibriumIndices = findEquilibriumIndices(A);
        System.out.println("Equilibrium indices: " + equilibriumIndices); // Output: [0, 3, 6]
    }

    public static List<Integer> findEquilibriumIndices(int[] A) {
        List<Integer> result = new ArrayList<>();
        int totalSum = 0, leftSum = 0;

        // Compute total sum of the array
        for (int num : A) {
            totalSum += num;
        }

        // Traverse the array and check equilibrium condition
        for (int i = 0; i < A.length; i++) {
            // Check if left sum is equal to right sum
            if (leftSum == totalSum - leftSum - A[i]) {
                result.add(i);
            }
            leftSum += A[i]; // Update left sum for next iteration
        }

        return result;

    }
}
