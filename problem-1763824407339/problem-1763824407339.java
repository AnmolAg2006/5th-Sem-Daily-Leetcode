// Last updated: 11/22/2025, 8:43:27 PM
class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;

        for (int x = num1; x <= num2; x++) {
            ans += waviness(x);
        }

        return ans;
    }
    private int waviness(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        if (n < 3) return 0;

        int co = 0;

        for (int i = 1; i < n - 1; i++) {
            char a = s.charAt(i - 1);
            char b = s.charAt(i);
            char c = s.charAt(i + 1);

            if (b > a && b > c) co++;   
            else if (b < a && b < c) co++;  
        }

        return co;
    }
}