// Last updated: 8/23/2025, 10:26:21 PM
class Solution {
    public int longestBeautifulSubstring(String word) {
        int ans = 0;
        int curr = 0;
        int j = 0;
        String v = "aeiou";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (curr == 0) {
                // Start a new substring only if the current character is 'a'
                if (ch == 'a') {
                    curr = 1;
                    j = 0;
                }
            } else {
                if (ch == v.charAt(j)) {
                    curr++;
                } else if (j < 4 && ch == v.charAt(j + 1)) {
                    j++;
                    curr++;
                } else {
                    // Check if the current substring is valid before resetting
                    if (j == 4) {
                        ans = Math.max(ans, curr);
                    }
                    // Reset: check if the current character can start a new substring
                    if (ch == 'a') {
                        curr = 1;
                        j = 0;
                    } else {
                        curr = 0;
                        j = 0;
                    }
                }
            }
            // Check for a valid substring at each step
            if (j == 4) {
                ans = Math.max(ans, curr);
            }
        }

        // Final check in case the entire string is a valid substring
        if (j == 4) {
            ans = Math.max(ans, curr);
        }

        return ans;
    }
}