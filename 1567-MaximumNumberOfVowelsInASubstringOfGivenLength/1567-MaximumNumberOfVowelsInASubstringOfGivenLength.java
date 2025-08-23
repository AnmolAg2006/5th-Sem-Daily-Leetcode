// Last updated: 8/23/2025, 10:27:04 PM
class Solution {
    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        if (k > s.length())
            return 0;
        int numVowels = 0;
        int i = 0;
        for (; i < k; i++) {
            char ch = s.charAt(i);
            if (isVowel(ch))
                numVowels++;
        }
        int maxVowels = numVowels;
        for (; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) numVowels++;
            ch = s.charAt(i - k);
            if (isVowel(ch)) numVowels--;
            if (numVowels > maxVowels)
                maxVowels = numVowels;
        }
        return maxVowels;
    }
}