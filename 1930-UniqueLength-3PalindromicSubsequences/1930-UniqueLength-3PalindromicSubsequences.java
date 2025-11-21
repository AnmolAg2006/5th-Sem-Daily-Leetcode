// Last updated: 11/21/2025, 11:02:37 AM
class Solution {
    public static int distinct(String s, int i, int j) {
        HashSet<Character> hs = new HashSet<>();
        for (int k = i + 1; k < j; k++) {
            hs.add(s.charAt(k));
        }
        return hs.size();
    }

    public int countPalindromicSubsequence(String s) {
        HashSet<Character> hs = new HashSet<>();
        int f[][] = new int[26][2];
        for(int i[]:f)
        {
            Arrays.fill(i,-1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!hs.contains(c)) {
                f[c - 'a'][0] = i;
                f[c - 'a'][1] = i;
            } else {
                f[c - 'a'][1] = i;
            }
            hs.add(c);
        }
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (f[i][0] != -1 ) {
                if (distinct(s, f[i][0], f[i][1]) > 0) {
                    ans += distinct(s, f[i][0], f[i][1]);
                }
            }
        }
        return ans;
    }
}