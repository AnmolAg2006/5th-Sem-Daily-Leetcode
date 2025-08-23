// Last updated: 8/23/2025, 10:27:38 PM
import java.util.Arrays;

class Solution {
    public static boolean isItPossible(int weights[], int days, int mid) {
        int load = 0, day = 1; // Start with the first day
        for (int wt : weights) {
            // If adding the weight exceeds the capacity, start a new day
            if (load + wt > mid) {
                day++; // Start a new day
                load = wt; // Start the new day with the current weight
            } else {
                load += wt; // Add the current weight to the current day
            }
            if (day > days) {
                return false; // If the number of days exceeds the limit, return false
            }
        }
        return true; // All items can be shipped within the given days
    }

    public int shipWithinDays(int[] weights, int days) {
        int s = 0;
        int e = 0;
        
        // Find the minimum and maximum possible capacities
        for (int i = 0; i < weights.length; i++) {
            s = Math.max(s, weights[i]);  // The largest weight item (smallest possible capacity)
            e += weights[i];  // The sum of all weights (total weight)
        }

        // Perform binary search to find the minimum possible capacity
        while (s < e) {
            int mid = (s + e) / 2;  // Midpoint for binary search
            if (isItPossible(weights, days, mid)) {
                e = mid;  // Try a smaller max capacity
            } else {
                s = mid + 1;  // Try a larger max capacity
            }
        }

        return s;  // The minimum possible ship capacity that works
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] weights = {3, 2, 2, 4, 1, 4};
        int days = 3;
        System.out.println(solution.shipWithinDays(weights, days));  // Output the result
    }
}
