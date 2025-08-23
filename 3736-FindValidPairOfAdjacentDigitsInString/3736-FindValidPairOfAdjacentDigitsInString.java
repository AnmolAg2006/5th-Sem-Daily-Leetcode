// Last updated: 8/23/2025, 10:23:54 PM
class Solution {
    public String findValidPair(String s) {
        // Create an array to store the frequency of each digit in the string
        int[] count = new int[10];
        
        // Count the frequency of each digit in the string
        for (char c : s.toCharArray()) {
            count[c - '0']++;
        }
        
        // Traverse the string to find the first valid pair
        for (int i = 0; i < s.length() - 1; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);
            
            // Check if the pair is valid
            if (first != second && count[first - '0'] == first - '0' && count[second - '0'] == second - '0') {
                return "" + first + second;
            }
        }
        
        // Return empty string if no valid pair is found
        return "";
    }
}
